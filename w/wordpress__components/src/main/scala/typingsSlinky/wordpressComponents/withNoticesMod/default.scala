package typingsSlinky.wordpressComponents.withNoticesMod

import slinky.core.ReactComponentClass
import typingsSlinky.std.Omit
import typingsSlinky.wordpressComponents.wordpressComponentsStrings.noticeList
import typingsSlinky.wordpressComponents.wordpressComponentsStrings.noticeOperations
import typingsSlinky.wordpressComponents.wordpressComponentsStrings.noticeUI
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@wordpress/components/higher-order/with-notices", JSImport.Default)
@js.native
object default extends js.Object {
  
  // prettier-ignore
  def apply[T /* <: ReactComponentClass[_] */](wrapped: T): ReactComponentClass[Omit[_, noticeList | noticeOperations | noticeUI]] = js.native
}
