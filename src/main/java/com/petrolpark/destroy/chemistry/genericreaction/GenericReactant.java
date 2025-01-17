package com.petrolpark.destroy.chemistry.genericreaction;

import com.petrolpark.destroy.chemistry.Group;
import com.petrolpark.destroy.chemistry.Molecule;

public class GenericReactant<G extends Group<G>> {

    private Molecule molecule;
    private G group;

    public GenericReactant(Molecule molecule, G group) {
        this.molecule = molecule;
        this.group = group;
    };

    public Molecule getMolecule() {
        return this.molecule;
    };

    public G getGroup() {
        return this.group;
    };
}
