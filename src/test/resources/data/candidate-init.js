db = db.getSiblingDB('candidate')

db.createUser({
    user: "candidate_user",
    pwd: "password",
    roles: [{
        role: "readWrite",
        db: 'candidate'
    }]
})

db.createCollection('candidate');

db.candidate.insertMany([
    {
        name: "senior jave developer",
        skills: ["java"],
    },
    {
        name: "scrum master",
        skills: ["agile", "jira"],
    },
    {
        name: "techonology director",
        skills: ["management", "java"],
    },
])