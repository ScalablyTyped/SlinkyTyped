package typingsSlinky.yog2Kernel.anon

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import typingsSlinky.nodeRal.mod.Config
import typingsSlinky.nodeRal.mod.ConfigNormalizer
import typingsSlinky.nodeRal.mod.RAL.RalRunner
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofRAL extends js.Object {
  
  def apply(serviceName: String): RalRunner = js.native
  def apply(serviceName: String, options: js.Object): RalRunner = js.native
  
  var NormalizerManager: Instantiable0[typingsSlinky.nodeRal.mod.RAL.NormalizerManager] = js.native
  
  var RalRunner: Instantiable1[/* serviceName */ String, typingsSlinky.nodeRal.mod.RAL.RalRunner] = js.native
  
  def appendExtPath(extPath: String): Unit = js.native
  
  def getConf(name: String): Config = js.native
  
  def getRawConf(name: String): Config = js.native
  
  def init(): Unit = js.native
  def init(options: js.Object): Unit = js.native
  
  def reload(): Unit = js.native
  def reload(options: js.Object): Unit = js.native
  
  def setConfigNormalizer(normalizers: ConfigNormalizer): Unit = js.native
}
