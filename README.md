# Personal-Project
My personal Java Project

- Fantasy World generator- 
- NPC generator
    - with current emotion
- Dice roller
- Website with things above?

My goal is to make a NPC generator for ttrpg related uses. It will allow the user to put in certain aspects like ancestries, class (if needed), emotions, current emotion to the party (random or custom), appearance, and name (custom or generator).

# Feature goals
- [ ] Choose ancestries (drop down list)
- [ ] Choose what system
- [ ] Add custom ttrpg ancestries
- [ ] Add occupation (classes, jobs)
- [ ] Store the new NPC in folders and list that the user can keep
    - Store all NPC created
    - Filter by ancestries, systems, etc
- [ ] Generator emotion towards the part random but based a number the user imputs 
- [ ] Appearance generator
- [ ] Name generator


Future Classes to implement
(Abstract)
- NPCComponent 
- Generator 
- PersonalityProfile 
- TaggableEntity
- Displayable

(interfaces)
- Generatable 
- Describable
- Taggable
- Savable
- Identifiable

Enum
- Occupation
- Quirk
- Race/Ancestry (maybe)
- SystemType
- PersonalityTract
- Language
- RegionType
- WorldType (Fantasy, Sci-Fi, etc)
