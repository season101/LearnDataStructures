//writing a generic interface 
public static double average(Measurable[] objects){
  if (objects.length == 0){
    return 0;
  }
  double sum = 0;
  for (Measurable obj: objects){
    sum = sum+obj.getMeasure();
  }

  return sum/objects.length();
}
