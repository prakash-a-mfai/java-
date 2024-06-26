package practice;

class Associate {
    private String name;
    private int id;
    private int experience;
    private String technology;

    
    public Associate(String name, int id, int experience, String technology) {
        this.name = name;
        this.id = id;
        this.experience = experience;
        this.technology = technology;
    }

    
    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public int getExperience() {
        return experience;
    }

    public String getTechnology() {
        return technology;
    }
}

class Solution {
    public static Associate[] filterByTechnologyAndExperience(Associate[] associates, String searchTechnology) {
        int count = 0;
        for (Associate associate : associates) {
            if (associate.getTechnology().equalsIgnoreCase(searchTechnology)) {
                count++;
            }
        }

        
        Associate[] result = new Associate[count];
        int index = 0;

        for (Associate associate : associates) {
            if (associate.getTechnology().equalsIgnoreCase(searchTechnology) && associate.getExperience() % 5 == 0) {
                result[index] = associate;
                index++;
            }
        }

        return result;
    }
}
 public class Main {
    public static void main(String[] args) {
        Associate[] associates = {
            new Associate("John", 1, 10, "Java"),
            new Associate("Jane", 2, 15, "Python"),
            new Associate("Doe", 3, 20, "Java"),
            new Associate("Smith", 4, 25, "Java"),
            new Associate("Alex", 5, 30, "Python")
        };

        String searchTechnology = "Java";
        Associate[] filteredAssociates = Solution.filterByTechnologyAndExperience(associates, searchTechnology);

        
     System.out.println("Associates with technology " + searchTechnology + " and experience in multiples of 5:");
        for (Associate associate : filteredAssociates) {
            System.out.println(associate.getName() + ", " + associate.getId() + ", " + associate.getExperience() + ", " + associate.getTechnology());
        }
    }
}
