package typingsSlinky.winrtUwp.Windows.Data

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object Text {
  
  /** Defines the signature of a function that is provided to SelectableWordsSegmenter.Tokenize . */
  type SelectableWordSegmentsTokenizingHandler = js.Function2[
    /* precedingWords */ typingsSlinky.winrtUwp.Windows.Foundation.Collections.IIterable[typingsSlinky.winrtUwp.Windows.Data.Text.SelectableWordSegment], 
    /* words */ typingsSlinky.winrtUwp.Windows.Foundation.Collections.IIterable[typingsSlinky.winrtUwp.Windows.Data.Text.SelectableWordSegment], 
    scala.Unit
  ]
  
  /** Defines the signature of a function that is provided to WordsSegmenter.Tokenize . */
  type WordSegmentsTokenizingHandler = js.Function2[
    /* precedingWords */ typingsSlinky.winrtUwp.Windows.Foundation.Collections.IIterable[typingsSlinky.winrtUwp.Windows.Data.Text.WordSegment], 
    /* words */ typingsSlinky.winrtUwp.Windows.Foundation.Collections.IIterable[typingsSlinky.winrtUwp.Windows.Data.Text.WordSegment], 
    scala.Unit
  ]
}
