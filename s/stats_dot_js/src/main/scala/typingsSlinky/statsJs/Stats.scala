package typingsSlinky.statsJs

import org.scalajs.dom.raw.HTMLCanvasElement
import org.scalajs.dom.raw.HTMLDivElement
import typingsSlinky.statsJs.Stats.Panel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Stats extends StObject {
  
  var REVISION: Double = js.native
  
  def addPanel(panel: Panel): Panel = js.native
  
  def begin(): Unit = js.native
  
  var dom: HTMLDivElement = js.native
  
  def end(): Double = js.native
  
  /**
    * @param value 0:fps, 1: ms, 2: mb, 3+: custom
    */
  def showPanel(value: Double): Unit = js.native
  
  def update(): Unit = js.native
}
object Stats {
  
  @scala.inline
  def apply(
    REVISION: Double,
    addPanel: Panel => Panel,
    begin: () => Unit,
    dom: HTMLDivElement,
    end: () => Double,
    showPanel: Double => Unit,
    update: () => Unit
  ): Stats = {
    val __obj = js.Dynamic.literal(REVISION = REVISION.asInstanceOf[js.Any], addPanel = js.Any.fromFunction1(addPanel), begin = js.Any.fromFunction0(begin), dom = dom.asInstanceOf[js.Any], end = js.Any.fromFunction0(end), showPanel = js.Any.fromFunction1(showPanel), update = js.Any.fromFunction0(update))
    __obj.asInstanceOf[Stats]
  }
  
  @js.native
  trait Panel extends StObject {
    
    var dom: HTMLCanvasElement = js.native
    
    def update(value: Double, maxValue: Double): Unit = js.native
  }
  object Panel {
    
    @scala.inline
    def apply(dom: HTMLCanvasElement, update: (Double, Double) => Unit): Panel = {
      val __obj = js.Dynamic.literal(dom = dom.asInstanceOf[js.Any], update = js.Any.fromFunction2(update))
      __obj.asInstanceOf[Panel]
    }
    
    @scala.inline
    implicit class PanelMutableBuilder[Self <: Panel] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDom(value: HTMLCanvasElement): Self = StObject.set(x, "dom", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUpdate(value: (Double, Double) => Unit): Self = StObject.set(x, "update", js.Any.fromFunction2(value))
    }
  }
  
  @scala.inline
  implicit class StatsMutableBuilder[Self <: Stats] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddPanel(value: Panel => Panel): Self = StObject.set(x, "addPanel", js.Any.fromFunction1(value))
    
    @scala.inline
    def setBegin(value: () => Unit): Self = StObject.set(x, "begin", js.Any.fromFunction0(value))
    
    @scala.inline
    def setDom(value: HTMLDivElement): Self = StObject.set(x, "dom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnd(value: () => Double): Self = StObject.set(x, "end", js.Any.fromFunction0(value))
    
    @scala.inline
    def setREVISION(value: Double): Self = StObject.set(x, "REVISION", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowPanel(value: Double => Unit): Self = StObject.set(x, "showPanel", js.Any.fromFunction1(value))
    
    @scala.inline
    def setUpdate(value: () => Unit): Self = StObject.set(x, "update", js.Any.fromFunction0(value))
  }
}
