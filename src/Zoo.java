public class Zoo {

    public static class Kletka {

        public static class Animal {
            private String typeAnimal;
            private String color;

            public Animal(String typeAnimal, String color) {
                
            }

            public String getTypeAnimal() {
                return typeAnimal;
            }

            public String getColor() {
                return color;
            }

            public String setColor(String color) {
                this.color = color;
                return color;
            }

            public void Golos() {
                if (typeAnimal.equals("Лев"))
                    System.out.println(typeAnimal + " рычит!");
                else if (typeAnimal.equals("Кенгуру"))
                    System.out.println(typeAnimal + " ричит что-то на австралийском");
            }


            public void Vstal() {
                if (typeAnimal.equals("Кенгуру")) {
                    System.out.println(typeAnimal + " встал на хвост!");
                } else {
                    System.out.println(typeAnimal + " встал на лапы!");
                }
            }

            public static class Lion extends Animal {

                public Lion(String typeAnimal, String color) {
                    super(typeAnimal, color);
                }
            }

            public class Kango extends Animal {
                public Kango(String typeAnimal, String color) {
                    super(typeAnimal, color);
                }
            }
        }
    }
    public static void main(String[] args) {
        Kletka.Animal.Lion lev = new Kletka.Animal.Lion("Лев", "желтый");
        System.out.println(lev.getTypeAnimal());
    }
}
