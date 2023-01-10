package hw13.servises;

import hw13.models.Course;
import hw13.models.Repo;

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
