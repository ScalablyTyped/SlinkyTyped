package typingsSlinky.storybookComponents.propsTableMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait PropsTableError extends js.Object
@JSImport("@storybook/components/dist/blocks/PropsTable/PropsTable", "PropsTableError")
@js.native
object PropsTableError extends js.Object {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[PropsTableError with String] = js.native
  
  @js.native
  sealed trait NO_COMPONENT extends PropsTableError
  /* "No component found" */ @js.native
  object NO_COMPONENT extends TopLevel[NO_COMPONENT with String]
  
  @js.native
  sealed trait PROPS_UNSUPPORTED extends PropsTableError
  /* "Props unsupported. See Props documentation for your framework." */ @js.native
  object PROPS_UNSUPPORTED extends TopLevel[PROPS_UNSUPPORTED with String]
}
