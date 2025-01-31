public class Student {

        private String name;//properties or attributes
        private String course;

      public Student(){
      }

      public Student(String n,String c)
      {
          this.name=n;
          this.course=c;
      }
      public String getName()
      {
          return this.name;
      }
        public void setName(String n)
        {
            this.name = n;
        }
        public String getCourse()
        {
            return this.course;
        }
            public void setCourse(String c)
        {
            this.course=c;
        }

    @Override
    public String toString() {
        return this.name +" "+this.course;
    }
}
