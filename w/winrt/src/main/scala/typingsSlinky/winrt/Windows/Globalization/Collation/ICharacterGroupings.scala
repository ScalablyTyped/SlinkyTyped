package typingsSlinky.winrt.Windows.Globalization.Collation

import typingsSlinky.winrt.Windows.Foundation.Collections.IVectorView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ICharacterGroupings extends IVectorView[CharacterGrouping] {
  
  def lookup(text: String): String = js.native
}
