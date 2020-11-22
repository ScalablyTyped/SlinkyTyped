package typingsSlinky.vueDocgenApi

import typingsSlinky.astTypes.nodePathMod.NodePath
import typingsSlinky.babelTypes.mod.ObjectMethod_
import typingsSlinky.babelTypes.mod.ObjectProperty_
import typingsSlinky.babelTypes.mod.TSType
import typingsSlinky.vueInbrowserCompilerUtils.typesMod.PropDescriptor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("vue-docgen-api/dist/script-handlers/propHandler", JSImport.Namespace)
@js.native
object propHandlerMod extends js.Object {
  
  def default(documentation: typingsSlinky.vueDocgenApi.documentationMod.default, path: NodePath[_, _]): js.Promise[Unit] = js.native
  
  def describeDefault(
    propPropertiesPath: js.Array[NodePath[ObjectProperty_ | ObjectMethod_, _]],
    propDescriptor: PropDescriptor,
    propType: String
  ): Unit = js.native
  
  def describeRequired(
    propPropertiesPath: js.Array[NodePath[ObjectProperty_ | ObjectMethod_, _]],
    propDescriptor: PropDescriptor
  ): Unit = js.native
  
  def describeType(
    propPropertiesPath: js.Array[NodePath[ObjectProperty_ | ObjectMethod_, _]],
    propDescriptor: PropDescriptor
  ): js.UndefOr[String] = js.native
  
  def extractValuesFromTags(propDescriptor: PropDescriptor): Unit = js.native
  
  def getValuesFromTypeAnnotation(`type`: TSType): js.UndefOr[js.Array[String]] = js.native
}
