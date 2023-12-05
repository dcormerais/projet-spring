package fr.diginamic.projetspring.services;

import fr.diginamic.projetspring.entities.Genre;
import fr.diginamic.projetspring.repositories.GenreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Service gérant les opérations liées à l'entité Genre.
 */
@Service
public class GenreService {
    /**
     * Constructeur du service Genre.
     *
     * @param genreRepository Le repository pour les opérations liées à l'entité Genre.
     */
    @Autowired
    private GenreRepository genreRepository;

    public List<Genre> findAll() {
        return genreRepository.findAll();
    }
    public Genre updateGenre(Integer genreId, Genre genre) {
        // Votre logique de mise à jour du genre

        // Assurez-vous de retourner le genre mis à jour
        return genreRepository.save(genre);
    }

    public Genre findById(Integer genreId) {
        return genreRepository.findById(genreId).orElse(null);
    }

    /**
     * Enregistre un nouveau genre dans la base de données.
     *
     * @param genre Le genre à enregistrer.
     * @return Le genre enregistré.
     */
    public Genre createGenre(Genre genre) {
        return genreRepository.save(genre);
    }

    /**
     * Supprime un genre par son identifiant.
     *
     * @param genreId L'identifiant du genre à supprimer.
     */
    public void deleteGenre(Integer genreId) {
        genreRepository.deleteById(genreId);}

    public List<Genre> findByType(String type) {
        return genreRepository.findAllByType(type);
    }
}
