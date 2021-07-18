package ru.netology.manager;

import org.junit.jupiter.api.Test;
import ru.netology.domain.Movie;
import static org.junit.jupiter.api.Assertions.*;

class AfishaManagerTest {
    AfishaManager manager = new AfishaManager();

    @Test
    public void shouldAdd() {
        Movie deadline = new Movie(1, "Deadline", "horror");
        manager.add(deadline);

        Movie[] expected = new Movie[]{deadline};
        Movie[] actual = manager.getMovies();
        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldGetAll() {
        AfishaManager manager = new AfishaManager();

        Movie deadline = new Movie(1, "Deadline", "horror");
        manager.add(deadline);
        Movie a = new Movie(2, "A", "horror");
        manager.add(a);
        Movie b = new Movie(3, "B", "horror");
        manager.add(b);
        Movie c = new Movie(4, "C", "horror");
        manager.add(c);
        Movie d = new Movie(5, "D", "comedy");
        manager.add(d);
        Movie e = new Movie(6, "E", "comedy");
        manager.add(e);
        Movie f = new Movie(7, "F", "comedy");
        manager.add(f);
        Movie g = new Movie(8, "G", "comedy");
        manager.add(g);
        Movie h = new Movie(9, "H", "drama");
        manager.add(h);
        Movie j = new Movie(10, "J", "drama");
        manager.add(j);
        Movie k = new Movie(11, "K", "drama");
        manager.add(k);
        Movie l = new Movie(12, "L", "drama");
        manager.add(l);

        Movie[] expected = new Movie[]{l, k, j, h, g, f, e, d, c, b, a, deadline};
        Movie[] actual = manager.getAll();
        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldGetLastAddLimit() {
        AfishaManager manager = new AfishaManager(10);

        Movie deadline = new Movie(1, "Deadline", "horror");
        manager.add(deadline);
        Movie a = new Movie(2, "A", "horror");
        manager.add(a);
        Movie b = new Movie(3, "B", "horror");
        manager.add(b);
        Movie c = new Movie(4, "C", "horror");
        manager.add(c);
        Movie d = new Movie(5, "D", "comedy");
        manager.add(d);
        Movie e = new Movie(6, "E", "comedy");
        manager.add(e);
        Movie f = new Movie(7, "F", "comedy");
        manager.add(f);
        Movie g = new Movie(8, "G", "comedy");
        manager.add(g);
        Movie h = new Movie(9, "H", "drama");
        manager.add(h);
        Movie j = new Movie(10, "J", "drama");
        manager.add(j);

        Movie[] expected = new Movie[]{j, h, g, f, e, d, c, b, a, deadline};
        Movie[] actual = manager.getLastAdd();
        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldGetLastAddLowLimit() {
        AfishaManager manager = new AfishaManager(10);

        Movie e = new Movie(6, "E", "comedy");
        manager.add(e);
        Movie f = new Movie(7, "F", "comedy");
        manager.add(f);
        Movie g = new Movie(8, "G", "comedy");
        manager.add(g);
        Movie h = new Movie(9, "H", "drama");
        manager.add(h);
        Movie j = new Movie(10, "J", "drama");
        manager.add(j);

        Movie[] expected = new Movie[]{j, h, g, f, e};
        Movie[] actual = manager.getLastAdd();
        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldGetLastAddUpLimit() {
        AfishaManager manager = new AfishaManager(10);

        Movie deadline = new Movie(1, "Deadline", "horror");
        manager.add(deadline);
        Movie a = new Movie(2, "A", "horror");
        manager.add(a);
        Movie b = new Movie(3, "B", "horror");
        manager.add(b);
        Movie c = new Movie(4, "C", "horror");
        manager.add(c);
        Movie d = new Movie(5, "D", "comedy");
        manager.add(d);
        Movie e = new Movie(6, "E", "comedy");
        manager.add(e);
        Movie f = new Movie(7, "F", "comedy");
        manager.add(f);
        Movie g = new Movie(8, "G", "comedy");
        manager.add(g);
        Movie h = new Movie(9, "H", "drama");
        manager.add(h);
        Movie j = new Movie(10, "J", "drama");
        manager.add(j);
        Movie k = new Movie(11, "K", "drama");
        manager.add(k);
        Movie l = new Movie(12, "L", "drama");
        manager.add(l);

        Movie[] expected = new Movie[]{l, k, j, h, g, f, e, d, c, b};
        Movie[] actual = manager.getLastAdd();
        assertArrayEquals(expected, actual);
    }
}