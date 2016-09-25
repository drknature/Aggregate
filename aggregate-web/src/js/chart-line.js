var rangeMVal = 10;

      google.charts.load("current", {packages:["corechart"]});
      google.charts.setOnLoadCallback(drawChart);
    
      function drawChart() {
        var data = [
          ['Week', 'Concern Level']
        ];

        var outOfRageData = [];

        var options = {
          legend: 'none',
          hAxis: { minValue: 1, maxValue: rangeMVal},
          curveType: 'function',
          pointSize: 10,
        };

        var chartM = new google.visualization.LineChart(document.getElementById('chart_divM'));
        chartM.draw(google.visualization.arrayToDataTable(data), options);

    var rangeM = document.querySelector('#rangeM');
    rangeM.addEventListener('value-change', function() {
        document.querySelector('#rangeMLabel').textContent = rangeM.value;
        rangeMVal = rangeM.value;
        options.hAxis.maxValue = rangeMVal;
        data.forEach(function(dat, i) {
          if(i == 0) return;

          if(dat[0] > rangeMVal) {
            outOfRageData.push(dat);
            data.splice(i, 1);
          }
        });

        outOfRageData.forEach(function(dat, i) {
          if(dat[0] <= rangeMVal) {
            data.push(dat)
            outOfRageData.splice(i, 1)
          }
        //data.sort(function(a, b){return a-b});
        });


        chartM.draw(google.visualization.arrayToDataTable(data), options);
        console.log(rangeMVal);
    });
    }