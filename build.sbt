lazy val opts = Seq(
  scalaVersion := "2.11.8",
  resolvers += "Typesafe Repository" at "http://repo.typesafe.com/typesafe/releases/"
)

lazy val root = (project in file(".")).
  aggregate(chapterCode, exercises, answers)

lazy val chapterCode =
  (project in file("chaptercode")).
    settings(name := "chapter-code").
    settings(opts)

lazy val exercises =
  (project in file("exercises")).
    settings(name := "exercises").
    settings(opts)

lazy val answers =
  (project in file("answers")).
    settings(name := "answers").
    settings(opts)
