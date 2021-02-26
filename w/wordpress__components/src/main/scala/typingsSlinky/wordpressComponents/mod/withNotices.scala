package typingsSlinky.wordpressComponents.mod

import slinky.core.ReactComponentClass
import typingsSlinky.std.Omit
import typingsSlinky.wordpressComponents.wordpressComponentsStrings.noticeList
import typingsSlinky.wordpressComponents.wordpressComponentsStrings.noticeOperations
import typingsSlinky.wordpressComponents.wordpressComponentsStrings.noticeUI
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object withNotices {
  
  // prettier-ignore
  @JSImport("@wordpress/components", "withNotices")
  @js.native
  def apply[T /* <: ReactComponentClass[_] */](wrapped: T): ReactComponentClass[Omit[_, noticeList | noticeOperations | noticeUI]] = js.native
}
