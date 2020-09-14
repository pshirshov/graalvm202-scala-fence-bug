name := "graalvm202-scala-fence-bug"

version := "0.1"

scalaVersion := "2.13.3"

graalVMNativeImageOptions ++= Seq(
  "--no-fallback",
  "--verbose",
  "-H:+ReportExceptionStackTraces",
  "-H:+TraceClassInitialization",
  "--allow-incomplete-classpath",
  "--report-unsupported-elements-at-runtime",
  "--enable-https",
  "--enable-http",
  "--enable-all-security-services",
  "--initialize-at-build-time=scala,testpkg"
)

libraryDependencies += "org.graalvm.nativeimage" % "svm" % "20.2.0" % Provided

enablePlugins(GraalVMNativeImagePlugin)
