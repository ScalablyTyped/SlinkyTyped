package typingsSlinky.semanticUiProgress.anon

import typingsSlinky.semanticUiProgress.SemanticUI.Progress.RandomSettings
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-progress.SemanticUI.ProgressSettings._Impl, 'random'> */
@js.native
trait PickImplrandom extends StObject {
  
  var random: RandomSettings = js.native
}
object PickImplrandom {
  
  @scala.inline
  def apply(random: RandomSettings): PickImplrandom = {
    val __obj = js.Dynamic.literal(random = random.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplrandom]
  }
  
  @scala.inline
  implicit class PickImplrandomMutableBuilder[Self <: PickImplrandom] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRandom(value: RandomSettings): Self = StObject.set(x, "random", value.asInstanceOf[js.Any])
  }
}
