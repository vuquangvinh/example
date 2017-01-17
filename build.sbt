name := "scalapb-example"

version := "1.0"

scalaVersion := "2.11.8"

// ScalaPB
import com.trueaccord.scalapb.{ScalaPbPlugin  => PB}
PB.protobufSettings
PB.scalapbVersion := "0.4.21"
PB.javaConversions in PB.protobufConfig := true
PB.flatPackage  in PB.protobufConfig := true
version in PB.protobufConfig := "2.5.0"