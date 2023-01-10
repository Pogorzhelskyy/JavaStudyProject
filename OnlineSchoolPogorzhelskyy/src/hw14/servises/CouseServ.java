package hw14.servises;

import hw14.models.Course;
import hw14.models.Repo;

public class CouseServ {
    private static Repo<Course> courseRepo;

    public static void initialCreate() {
        courseRepo = new Repo<>(new Course[5]);
        for (int i = 0; i < 2; i++) {
            courseRepo.add(new Course(i));

        }
    }

    public static Repo<Course> getCourseRepo() {
        return courseRepo;
    }
}
