import microsites.ExtraMdFileConfig

lazy val noPublish = Seq(
  publish := {},
  publishLocal := {},
  publishArtifact := false,
  skip in publish := true
)

lazy val root = project
  .in(file("."))
  .enablePlugins(MicrositesPlugin)
  .settings(
    organization := "com.abtech",
    name := "sbt_websites",
    version := "0.1",
    scalaVersion := "2.13.1"
  )
  .settings(noPublish)
  .settings(
    micrositeName := "Test Website",
    micrositeDescription := "Integrating sbt-microsites",
    micrositeAuthor := "abdhesh",
    micrositeGithubOwner := "abdhesh",
    micrositeGithubRepo := "sbt_websites"
  )
