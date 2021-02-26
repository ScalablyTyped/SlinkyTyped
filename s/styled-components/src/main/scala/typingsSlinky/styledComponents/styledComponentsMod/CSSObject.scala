package typingsSlinky.styledComponents.styledComponentsMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.csstype.mod.Properties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CSSObject
  extends Properties[String | Double]
     with CSSPseudos
     with /* key */ StringDictionary[js.UndefOr[CSSObject | String | Double]]
     with _InterpolationValue
object CSSObject {
  
  @scala.inline
  def apply(): CSSObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CSSObject]
  }
}
