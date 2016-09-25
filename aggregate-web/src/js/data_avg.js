  var class_interestTotal=0;
    var class_learningTotal=0;
    var class_strugglingTotal=0;
      var class_difficulyTotal=0;
      var class_speedTotal =0;
    var class_workTotal=0;
    var mental_anxietyTotal=0;
    var mental_depressedTotal=0;
    var mental_overworkedTotal=0;
      var mental_hoursWorkedTotal=0;
    var mental_stressTotal=0;
    var mental_tiredTotal=0;
      var mental_allNightersTotal = 0;
      var mental_classSleepTotal=0;
      var mental_hoursSleepTotal=0;
    var mental_worriedFutureTotal=0;
    var physical_exerciseTotal=0;
      var physical_hoursExerciseTotal=0;
      var physical_intensityTotal=0;
    var physical_nutritionTotal=0;
      var physical_nutritionConsistentTotal=0;
    var physical_weightGainTotal=0;
      var physical_weightGainIncrease=0;
    var physical_weightLossTotal=0;
      var physical_weightLossDecreaseTotal=0;
    var social_chillTimeTotal=0;
    var social_hobbiesTotal=0;
    var social_relationshipsTotal=0;
      var social_stabilityTotal=0;

  var databaseRef = new Firebase("https://aggregate-23ea3.firebaseio.com/");
  databaseRef.once("value", function(allDatabaseSnapshot){
    allDatabaseSnapshot.forEach(function(databaseSnapshot){
      count+=1;
      var datasetDate = databaseSnapshot.child("ID").child("Date").val();
      var class_interestTotal += databaseSnapshot.child("Academic").child("Class Interest").val();
      var class_learningTotal += databaseSnapshot.child("Academic").child("Class Learning").val();
      var class_strugglingTotal += database.Snapshot.child("Academic").child("Class Struggling").val();
      var class_difficulyTotal += database.Snapshot.child("Academic").child("Class Struggling").child("Difficulty").val();
      var class_speedtotal += database.Snapshot.child("Academic").child("Class Struggling").child("Speed").var();
      var class_workTotal += database.Snapshot.child("Academic").child("Class Work").val();
      var mental_anxietyTotal += database.Snapshot.child("Mental").child("Anxiety").val();
      var mental_depressedTotal += database.Snapshot.child("Mental").child("Depressed").val();
      var mental_overworkedTotal += database.Snapshot.child("Mental").child("Overworked").val();
      var mental_hoursWorkedTotal += database.Snapshot.child("Mental").child("Overworked").child("Hours Worked").val();
      var mental_stressTotal += database.Snapshot.child("Mental").child("Stress").val();
      var mental_tiredTotal += database.Snapshot.child("Mental").child("Tired").val();
      var mental_allNightersTotal += database.Snapshot.child("Mental").child("Tired").child("All Nighters").val();
      var mental_classSleepTotal += database.Snapshot.child("Mental").child("Tired").child("Hours Class Sleep").val();
      var mental_hoursSleepTotal += database.Snapshot.child("Mental").child("Tired").child("Hours Sleep").val();
      var mental_worriedFutureTotal+= database.Snapshot.child("Mental").child("Worried_Future").val();
      var physical_exerciseTotal+= database.Snapshot.child("Physical").child("Exercise").val();
      var physical_hoursExerciseTotal += database.Snapshot.child("Physical").child("Exercise").child("Hours Execise").val();
      var physical_intensityTotal += database.Snapshot.child("Physical").child("Exercise").child("Intensity").val();
      var physical_nutritionTotal += database.Snapshot.child("Physical").child("Nutrition").val();
      var physical_nutritionConsistentTotal += database.Snapshot.child("Physical").child("Nutrition").child("Consistent").val();
      var physical_weightGainTotal+= database.Snapshot.child("Physical").child("Weight Gain").val();
      var physical_weightGainIncrease += database.Snapshot.child("Physical").child("Weight Gain").child("Gain Increase").val();
      var physical_weightLossTotal += database.Snapshot.child("Physical").child("Weight Loss").val();
      var physical_weightLossDecreaseTotal += database.Snapshot.child("Physical").child("Weight Loss").child("Loss Decrease").val();
      var social_chillTimeTotal += database.Snapshot.child("Social").child("Chill Time").val();
      var social_hobbiesTotal += database.Snapshot.child("Social").child("Hobbies Time").val();
      var social_relationshipsTotal += database.Snapshot.child("Social").child("Relationships").val();
      var social_stabilityTotal += database.Snapshot.child("Social").child("Relationships").child("Stability").val();
    })
  }

  var mental_Average=(mental_anxietyTotal + mental_depressedTotal+ mental_overworkedTotal+mental_hoursWorkedTotal + mental_stressTotal+ mental_tiredTotal+ mental_allNightersTotal+ mental_classSleepTotal+mental_hoursSleepTotal+ mental_worriedFutureTotal)/(count);

  var physical_Average = (physical_exerciseTotal+ physical_hoursExerciseTotal+physical_intensityTotal+physical_nutritionTotal+ physical_nutritionConsistentTotal+ physical_weightGainTotal+physical_weightGainIncreasephysical_weightLossTotal+physical_weightLossDecreaseTotal)/(count);

  var social_Average = (social_chillTimeTotal + social_hobbiesTotal+ social_relationshipsTotal+social_stabilityTotal)/(count);
  
  var academic_Average=(class_interestTotal+class_learningTotal+class_strugglingTotal+class_difficultyTotal+class_speedtotal) /(count);

