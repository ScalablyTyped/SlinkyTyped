package typingsSlinky.storybookAddonKnobs.anon

import org.scalablytyped.runtime.Instantiable0
import typingsSlinky.storybookAddonKnobs.objectMod.ObjectTypeProps
import typingsSlinky.storybookAddonKnobs.objectMod.ObjectTypeState
import typingsSlinky.storybookAddonKnobs.objectMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofObjectType
  extends Instantiable0[default[js.Object]] {
  
  var defaultProps: ObjectTypeProps[_] = js.native
  
  def deserialize[T](value: String): T = js.native
  
  def getDerivedStateFromProps[T](props: ObjectTypeProps[T], state: ObjectTypeState[T]): ObjectTypeState[T] | Null = js.native
  
  var propTypes: OnChangeValidator = js.native
  
  def serialize[T](`object`: T): String = js.native
}
