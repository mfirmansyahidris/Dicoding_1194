package com.dev.fi.dicoding_1194;

import android.util.Log;

import java.util.ArrayList;

public class AnimalData {
    public static String[][] data = new String[][]{
            {"Kitten",
                    "Kitten is mamals",
                    "https://images.pexels.com/photos/45170/kittens-cat-cat-puppy-rush-45170.jpeg",
                    "cat (Felis silvestris catus or Felis catus) is a small, typically furry, carnivorous mammal. They are often called house cats[5] when kept as indoor pets or simply cats when there is no need to distinguish them from other felids and felines. They are often valued by humans for companionship and for their ability to hunt vermin. There are more than seventy cat breeds recognized by various cat registries."},
            {"Elephant",
                    "Elephant is big mamals",
                    "https://images.pexels.com/photos/66898/elephant-cub-tsavo-kenya-66898.jpeg",
                    "Elephants are large mammals of the family Elephantidae and the order Proboscidea. Three species are currently recognised: the African bush elephant (Loxodonta africana), the African forest elephant (L. cyclotis), and the Asian elephant (Elephas maximus). Elephants are scattered throughout sub-Saharan Africa, South Asia, and Southeast Asia. Elephantidae is the only surviving family of the order Proboscidea; other, now extinct, members of the order include deinotheres, gomphotheres, mammoths, and mastodons."},
            {"Sheeps",
                    "Sheeps is mamals too",
                    "https://images.pexels.com/photos/288621/pexels-photo-288621.jpeg",
                    "sheep (Ovis aries) are quadrupedal, ruminant mammals typically kept as livestock. Like most ruminants, sheep are members of the order Artiodactyla, the even-toed ungulates. Although the name sheep applies to many species in the genus Ovis, in everyday usage it almost always refers to Ovis aries. Numbering a little over one billion, domestic sheep are also the most numerous species of sheep. An adult female sheep is referred to as a ewe (/juː/), an intact male as a ram or occasionally a tup, a castrated male as a wether, and a younger sheep as a lamb."},
            {"Chicken",
                    "Chicken is not mamals",
                    "https://images.pexels.com/photos/1216482/pexels-photo-1216482.jpeg",
                    "The chicken (Gallus gallus domesticus) is a type of domesticated fowl, a subspecies of the red junglefowl. It is one of the most common and widespread domestic animals, with a total population of more than 19 billion as of 2011. There are more chickens in the world than any other bird or domesticated fowl.[1] Humans keep chickens primarily as a source of food (consuming both their meat and eggs) and, less commonly, as pets. Originally raised for cockfighting or for special ceremonies, chickens were not kept for food until the Hellenistic period (fourth–second centuries BCE).[2][3]"},
            {"Cow",
                    "Cow is mamals, they produce milk",
                    "https://images.pexels.com/photos/33550/cows-curious-cattle-agriculture.jpg",
                    "cows—are the most common type of large domesticated ungulates. They are a prominent modern member of the subfamily Bovinae, are the most widespread species of the genus Bos, and are most commonly classified collectively as Bos taurus."},
            {"Horse",
                    "Horse is a unit of measurement of power",
                    "https://images.pexels.com/photos/2971/farm-animals-horses.jpg",
                    "The horse (Equus ferus caballus)[2][3] is one of two extant subspecies of Equus ferus. It is an odd-toed ungulate mammal belonging to the taxonomic family Equidae. The horse has evolved over the past 45 to 55 million years from a small multi-toed creature, Eohippus, into the large, single-toed animal of today. Humans began domesticating horses around 4000 BC, and their domestication is believed to have been widespread by 3000 BC. Horses in the subspecies caballus are domesticated, although some domesticated populations live in the wild as feral horses. These feral populations are not true wild horses, as this term is used to describe horses that have never been domesticated, such as the endangered Przewalski's horse, a separate subspecies, and the only remaining true wild horse. There is an extensive, specialized vocabulary used to describe equine-related concepts, covering everything from anatomy to life stages, size, colors, markings, breeds, locomotion, and behavior."},
            {"Snail",
                    "Snail is food",
                    "https://images.pexels.com/photos/183333/pexels-photo-183333.jpeg",
                    "Snail is a common name loosely applied to shelled gastropods. The name is most often applied to land snails, terrestrial pulmonate gastropod molluscs. However, the common name snail is also used for most of the members of the molluscan class Gastropoda that have a coiled shell that is large enough for the animal to retract completely into. When the word \"snail\" is used in this most general sense, it includes not just land snails but also numerous species of sea snails and freshwater snails. Gastropods that naturally lack a shell, or have only an internal shell, are mostly called slugs, and land snails that have only a very small shell (that they cannot retract into) are often called semi-slugs."}
    };

    public static ArrayList<Animal> getListData(){
        Animal animal = null;
        ArrayList<Animal> list = new ArrayList<>();
        for (int i = 0; i <data.length; i++) {
            animal = new Animal();
            animal.setName(data[i][0]);
            animal.setRemarks(data[i][1]);
            animal.setPhoto(data[i][2]);
            animal.setDescr(data[i][3]);
            list.add(animal);
        }

        return list;
    }
}
