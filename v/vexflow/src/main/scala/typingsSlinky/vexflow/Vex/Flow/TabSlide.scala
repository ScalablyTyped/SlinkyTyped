package typingsSlinky.vexflow.Vex.Flow

import typingsSlinky.vexflow.Vex.IRenderContext
import typingsSlinky.vexflow.anon.Family
import typingsSlinky.vexflow.anon.Firstindices
import typingsSlinky.vexflow.anon.Firstxpx
import typingsSlinky.vexflow.anon.Lastindices
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TabSlide extends TabTie
object TabSlide {
  
  @scala.inline
  def apply(
    createHammeron: Firstindices => TabTie,
    createPulloff: Firstindices => TabTie,
    draw: () => Boolean,
    isPartial: () => Boolean,
    renderText: (Double, Double) => Unit,
    renderTie: Firstxpx => Unit,
    setContext: IRenderContext => StaveTie,
    setFont: Family => StaveTie,
    setNotes: Lastindices => StaveTie
  ): TabSlide = {
    val __obj = js.Dynamic.literal(createHammeron = js.Any.fromFunction1(createHammeron), createPulloff = js.Any.fromFunction1(createPulloff), draw = js.Any.fromFunction0(draw), isPartial = js.Any.fromFunction0(isPartial), renderText = js.Any.fromFunction2(renderText), renderTie = js.Any.fromFunction1(renderTie), setContext = js.Any.fromFunction1(setContext), setFont = js.Any.fromFunction1(setFont), setNotes = js.Any.fromFunction1(setNotes))
    __obj.asInstanceOf[TabSlide]
  }
}
