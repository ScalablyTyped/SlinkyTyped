package typingsSlinky.tensorflowTfjsLayers

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object initializersMod {
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.constant_
    - typingsSlinky.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.glorotNormal
    - typingsSlinky.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.glorotUniform
    - typingsSlinky.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.heNormal
    - typingsSlinky.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.heUniform
    - typingsSlinky.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.identity_
    - typingsSlinky.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.leCunNormal
    - typingsSlinky.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.leCunUniform
    - typingsSlinky.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.ones_
    - typingsSlinky.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.orthogonal_
    - typingsSlinky.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.randomNormal_
    - typingsSlinky.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.randomUniform_
    - typingsSlinky.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.truncatedNormal_
    - typingsSlinky.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.varianceScaling_
    - typingsSlinky.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.zeros_
    - java.lang.String
  */
  type InitializerIdentifier = typingsSlinky.tensorflowTfjsLayers.initializersMod._InitializerIdentifier | java.lang.String
  
  @scala.inline
  def checkDistribution(): scala.Unit = typingsSlinky.tensorflowTfjsLayers.initializersMod.^.asInstanceOf[js.Dynamic].applyDynamic("checkDistribution")().asInstanceOf[scala.Unit]
  @scala.inline
  def checkDistribution(value: java.lang.String): scala.Unit = typingsSlinky.tensorflowTfjsLayers.initializersMod.^.asInstanceOf[js.Dynamic].applyDynamic("checkDistribution")(value.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
  
  @scala.inline
  def checkFanMode(): scala.Unit = typingsSlinky.tensorflowTfjsLayers.initializersMod.^.asInstanceOf[js.Dynamic].applyDynamic("checkFanMode")().asInstanceOf[scala.Unit]
  @scala.inline
  def checkFanMode(value: java.lang.String): scala.Unit = typingsSlinky.tensorflowTfjsLayers.initializersMod.^.asInstanceOf[js.Dynamic].applyDynamic("checkFanMode")(value.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
  
  @scala.inline
  def getInitializer(identifier: typingsSlinky.tensorflowTfjsCore.serializationMod.ConfigDict): typingsSlinky.tensorflowTfjsLayers.initializersMod.Initializer = typingsSlinky.tensorflowTfjsLayers.initializersMod.^.asInstanceOf[js.Dynamic].applyDynamic("getInitializer")(identifier.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.tensorflowTfjsLayers.initializersMod.Initializer]
  @scala.inline
  def getInitializer(identifier: typingsSlinky.tensorflowTfjsLayers.initializersMod.Initializer): typingsSlinky.tensorflowTfjsLayers.initializersMod.Initializer = typingsSlinky.tensorflowTfjsLayers.initializersMod.^.asInstanceOf[js.Dynamic].applyDynamic("getInitializer")(identifier.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.tensorflowTfjsLayers.initializersMod.Initializer]
  @scala.inline
  def getInitializer(identifier: typingsSlinky.tensorflowTfjsLayers.initializersMod.InitializerIdentifier): typingsSlinky.tensorflowTfjsLayers.initializersMod.Initializer = typingsSlinky.tensorflowTfjsLayers.initializersMod.^.asInstanceOf[js.Dynamic].applyDynamic("getInitializer")(identifier.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.tensorflowTfjsLayers.initializersMod.Initializer]
  
  @scala.inline
  def serializeInitializer(initializer: typingsSlinky.tensorflowTfjsLayers.initializersMod.Initializer): typingsSlinky.tensorflowTfjsCore.serializationMod.ConfigDictValue = typingsSlinky.tensorflowTfjsLayers.initializersMod.^.asInstanceOf[js.Dynamic].applyDynamic("serializeInitializer")(initializer.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.tensorflowTfjsCore.serializationMod.ConfigDictValue]
}
