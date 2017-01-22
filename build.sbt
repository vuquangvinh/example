name := "scalapb-example"

version := "1.0"

scalaVersion := "2.11.8"

// ScalaPB
import com.trueaccord.scalapb.{ScalaPbPlugin  => PB}
PB.protobufSettings
PB.scalapbVersion := "0.4.21"
PB.javaConversions in PB.protobufConfig := true
PB.flatPackage  in PB.protobufConfig := true
PB.runProtoc in PB.protobufConfig := { args => com.github.os72.protocjar.Protoc.runProtoc("-v250" +: args.toArray) }


version in PB.protobufConfig := "2.5.0"
libraryDependencies += "com.trueaccord.scalapb" %% "scalapb-runtime" % "0.4.21" exclude ("com.google.protobuf", "protobuf-java")
