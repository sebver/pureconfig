name := "pureconfig-squants"

libraryDependencies ++= Seq(
  "org.typelevel" %% "squants" % "1.6.0")

developers := List(
  Developer("melrief", "Mario Pastorelli", "pastorelli.mario@gmail.com", url("https://github.com/melrief")),
  Developer("cranst0n", "Ian McIntosh", "cranston.ian@gmail.com", url("https://github.com/cranst0n")))

osgiSettings

OsgiKeys.exportPackage := Seq("pureconfig.module.squants.*")
OsgiKeys.privatePackage := Seq()
OsgiKeys.importPackage := Seq(s"""scala.*;version="[${scalaBinaryVersion.value}.0,${scalaBinaryVersion.value}.50)"""", "*")
