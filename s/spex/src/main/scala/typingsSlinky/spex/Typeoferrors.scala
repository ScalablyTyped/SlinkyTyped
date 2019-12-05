package typingsSlinky.spex

import org.scalablytyped.runtime.Instantiable0
import typingsSlinky.spex.spexMod.errors.BatchError
import typingsSlinky.spex.spexMod.errors.PageError
import typingsSlinky.spex.spexMod.errors.SequenceError
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Typeoferrors extends js.Object {
  // API: http://vitaly-t.github.io/spex/errors.BatchError.html
  var BatchError: Instantiable0[typingsSlinky.spex.spexMod.errors.BatchError]
  // API: http://vitaly-t.github.io/spex/errors.PageError.html
  var PageError: Instantiable0[typingsSlinky.spex.spexMod.errors.PageError]
  // API: http://vitaly-t.github.io/spex/errors.SequenceError.html
  var SequenceError: Instantiable0[typingsSlinky.spex.spexMod.errors.SequenceError]
}

object Typeoferrors {
  @scala.inline
  def apply(
    BatchError: Instantiable0[BatchError],
    PageError: Instantiable0[PageError],
    SequenceError: Instantiable0[SequenceError]
  ): Typeoferrors = {
    val __obj = js.Dynamic.literal(BatchError = BatchError.asInstanceOf[js.Any], PageError = PageError.asInstanceOf[js.Any], SequenceError = SequenceError.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Typeoferrors]
  }
}

