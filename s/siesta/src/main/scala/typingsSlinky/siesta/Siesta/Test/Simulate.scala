package typingsSlinky.siesta.Siesta.Test

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Siesta.Test.Simulate")
@js.native
object Simulate extends js.Object {
  
  /**
    * @mixin
    */
  @js.native
  trait IEvent extends js.Object {
    
    def simulateEvent(el: js.Any, `type`: String): Unit = js.native
    def simulateEvent(el: js.Any, `type`: String, the: js.UndefOr[scala.Nothing], suppressLog: Boolean): Unit = js.native
    def simulateEvent(el: js.Any, `type`: String, the: js.Any): Unit = js.native
    def simulateEvent(el: js.Any, `type`: String, the: js.Any, suppressLog: Boolean): Unit = js.native
    
    var simulateEventsWith: String = js.native
  }
  
  /**
    * @mixin
    */
  @js.native
  trait IKeyboard extends js.Object {
    
    def keyPress(el: js.Any, key: String, options: js.Any): Unit = js.native
    
    def `type`(el: js.Any, text: String): Unit = js.native
    def `type`(
      el: js.Any,
      text: String,
      callback: js.UndefOr[scala.Nothing],
      scope: js.UndefOr[scala.Nothing],
      options: js.Any
    ): Unit = js.native
    def `type`(el: js.Any, text: String, callback: js.UndefOr[scala.Nothing], scope: js.Any): Unit = js.native
    def `type`(el: js.Any, text: String, callback: js.UndefOr[scala.Nothing], scope: js.Any, options: js.Any): Unit = js.native
    def `type`(el: js.Any, text: String, callback: js.Function): Unit = js.native
    def `type`(el: js.Any, text: String, callback: js.Function, scope: js.UndefOr[scala.Nothing], options: js.Any): Unit = js.native
    def `type`(el: js.Any, text: String, callback: js.Function, scope: js.Any): Unit = js.native
    def `type`(el: js.Any, text: String, callback: js.Function, scope: js.Any, options: js.Any): Unit = js.native
  }
  
  /**
    * @mixin
    */
  @js.native
  trait IMouse extends js.Object {
    
    def click(): Unit = js.native
    def click(callback: js.UndefOr[scala.Nothing], scope: js.Any): Unit = js.native
    def click(callback: js.UndefOr[scala.Nothing], scope: js.Any, options: js.Any): Unit = js.native
    def click(callback: js.Function): Unit = js.native
    def click(callback: js.Function, scope: js.UndefOr[scala.Nothing], options: js.Any): Unit = js.native
    def click(callback: js.Function, scope: js.Any): Unit = js.native
    def click(callback: js.Function, scope: js.Any, options: js.Any): Unit = js.native
    def click(
      el: js.UndefOr[scala.Nothing],
      callback: js.UndefOr[scala.Nothing],
      scope: js.UndefOr[scala.Nothing],
      options: js.Any
    ): Unit = js.native
    def click(el: js.UndefOr[scala.Nothing], callback: js.UndefOr[scala.Nothing], scope: js.Any): Unit = js.native
    def click(el: js.UndefOr[scala.Nothing], callback: js.UndefOr[scala.Nothing], scope: js.Any, options: js.Any): Unit = js.native
    def click(el: js.UndefOr[scala.Nothing], callback: js.Function): Unit = js.native
    def click(
      el: js.UndefOr[scala.Nothing],
      callback: js.Function,
      scope: js.UndefOr[scala.Nothing],
      options: js.Any
    ): Unit = js.native
    def click(el: js.UndefOr[scala.Nothing], callback: js.Function, scope: js.Any): Unit = js.native
    def click(el: js.UndefOr[scala.Nothing], callback: js.Function, scope: js.Any, options: js.Any): Unit = js.native
    def click(el: js.Any): Unit = js.native
    def click(el: js.Any, callback: js.UndefOr[scala.Nothing], scope: js.UndefOr[scala.Nothing], options: js.Any): Unit = js.native
    def click(el: js.Any, callback: js.UndefOr[scala.Nothing], scope: js.Any): Unit = js.native
    def click(el: js.Any, callback: js.UndefOr[scala.Nothing], scope: js.Any, options: js.Any): Unit = js.native
    def click(el: js.Any, callback: js.Function): Unit = js.native
    def click(el: js.Any, callback: js.Function, scope: js.UndefOr[scala.Nothing], options: js.Any): Unit = js.native
    def click(el: js.Any, callback: js.Function, scope: js.Any): Unit = js.native
    def click(el: js.Any, callback: js.Function, scope: js.Any, options: js.Any): Unit = js.native
    
    def doubleClick(): Unit = js.native
    def doubleClick(callback: js.UndefOr[scala.Nothing], scope: js.Any): Unit = js.native
    def doubleClick(callback: js.UndefOr[scala.Nothing], scope: js.Any, options: js.Any): Unit = js.native
    def doubleClick(callback: js.Function): Unit = js.native
    def doubleClick(callback: js.Function, scope: js.UndefOr[scala.Nothing], options: js.Any): Unit = js.native
    def doubleClick(callback: js.Function, scope: js.Any): Unit = js.native
    def doubleClick(callback: js.Function, scope: js.Any, options: js.Any): Unit = js.native
    def doubleClick(
      el: js.UndefOr[scala.Nothing],
      callback: js.UndefOr[scala.Nothing],
      scope: js.UndefOr[scala.Nothing],
      options: js.Any
    ): Unit = js.native
    def doubleClick(el: js.UndefOr[scala.Nothing], callback: js.UndefOr[scala.Nothing], scope: js.Any): Unit = js.native
    def doubleClick(el: js.UndefOr[scala.Nothing], callback: js.UndefOr[scala.Nothing], scope: js.Any, options: js.Any): Unit = js.native
    def doubleClick(el: js.UndefOr[scala.Nothing], callback: js.Function): Unit = js.native
    def doubleClick(
      el: js.UndefOr[scala.Nothing],
      callback: js.Function,
      scope: js.UndefOr[scala.Nothing],
      options: js.Any
    ): Unit = js.native
    def doubleClick(el: js.UndefOr[scala.Nothing], callback: js.Function, scope: js.Any): Unit = js.native
    def doubleClick(el: js.UndefOr[scala.Nothing], callback: js.Function, scope: js.Any, options: js.Any): Unit = js.native
    def doubleClick(el: js.Any): Unit = js.native
    def doubleClick(el: js.Any, callback: js.UndefOr[scala.Nothing], scope: js.UndefOr[scala.Nothing], options: js.Any): Unit = js.native
    def doubleClick(el: js.Any, callback: js.UndefOr[scala.Nothing], scope: js.Any): Unit = js.native
    def doubleClick(el: js.Any, callback: js.UndefOr[scala.Nothing], scope: js.Any, options: js.Any): Unit = js.native
    def doubleClick(el: js.Any, callback: js.Function): Unit = js.native
    def doubleClick(el: js.Any, callback: js.Function, scope: js.UndefOr[scala.Nothing], options: js.Any): Unit = js.native
    def doubleClick(el: js.Any, callback: js.Function, scope: js.Any): Unit = js.native
    def doubleClick(el: js.Any, callback: js.Function, scope: js.Any, options: js.Any): Unit = js.native
    
    def drag(source: js.Any): Unit = js.native
    def drag(
      source: js.Any,
      target: js.UndefOr[scala.Nothing],
      delta: js.UndefOr[scala.Nothing],
      callback: js.UndefOr[scala.Nothing],
      scope: js.UndefOr[scala.Nothing],
      options: js.Any
    ): Unit = js.native
    def drag(
      source: js.Any,
      target: js.UndefOr[scala.Nothing],
      delta: js.UndefOr[scala.Nothing],
      callback: js.UndefOr[scala.Nothing],
      scope: js.Any
    ): Unit = js.native
    def drag(
      source: js.Any,
      target: js.UndefOr[scala.Nothing],
      delta: js.UndefOr[scala.Nothing],
      callback: js.UndefOr[scala.Nothing],
      scope: js.Any,
      options: js.Any
    ): Unit = js.native
    def drag(
      source: js.Any,
      target: js.UndefOr[scala.Nothing],
      delta: js.UndefOr[scala.Nothing],
      callback: js.Function
    ): Unit = js.native
    def drag(
      source: js.Any,
      target: js.UndefOr[scala.Nothing],
      delta: js.UndefOr[scala.Nothing],
      callback: js.Function,
      scope: js.UndefOr[scala.Nothing],
      options: js.Any
    ): Unit = js.native
    def drag(
      source: js.Any,
      target: js.UndefOr[scala.Nothing],
      delta: js.UndefOr[scala.Nothing],
      callback: js.Function,
      scope: js.Any
    ): Unit = js.native
    def drag(
      source: js.Any,
      target: js.UndefOr[scala.Nothing],
      delta: js.UndefOr[scala.Nothing],
      callback: js.Function,
      scope: js.Any,
      options: js.Any
    ): Unit = js.native
    def drag(source: js.Any, target: js.UndefOr[scala.Nothing], delta: js.Array[Double]): Unit = js.native
    def drag(
      source: js.Any,
      target: js.UndefOr[scala.Nothing],
      delta: js.Array[Double],
      callback: js.UndefOr[scala.Nothing],
      scope: js.UndefOr[scala.Nothing],
      options: js.Any
    ): Unit = js.native
    def drag(
      source: js.Any,
      target: js.UndefOr[scala.Nothing],
      delta: js.Array[Double],
      callback: js.UndefOr[scala.Nothing],
      scope: js.Any
    ): Unit = js.native
    def drag(
      source: js.Any,
      target: js.UndefOr[scala.Nothing],
      delta: js.Array[Double],
      callback: js.UndefOr[scala.Nothing],
      scope: js.Any,
      options: js.Any
    ): Unit = js.native
    def drag(source: js.Any, target: js.UndefOr[scala.Nothing], delta: js.Array[Double], callback: js.Function): Unit = js.native
    def drag(
      source: js.Any,
      target: js.UndefOr[scala.Nothing],
      delta: js.Array[Double],
      callback: js.Function,
      scope: js.UndefOr[scala.Nothing],
      options: js.Any
    ): Unit = js.native
    def drag(
      source: js.Any,
      target: js.UndefOr[scala.Nothing],
      delta: js.Array[Double],
      callback: js.Function,
      scope: js.Any
    ): Unit = js.native
    def drag(
      source: js.Any,
      target: js.UndefOr[scala.Nothing],
      delta: js.Array[Double],
      callback: js.Function,
      scope: js.Any,
      options: js.Any
    ): Unit = js.native
    def drag(source: js.Any, target: js.Any): Unit = js.native
    def drag(
      source: js.Any,
      target: js.Any,
      delta: js.UndefOr[scala.Nothing],
      callback: js.UndefOr[scala.Nothing],
      scope: js.UndefOr[scala.Nothing],
      options: js.Any
    ): Unit = js.native
    def drag(
      source: js.Any,
      target: js.Any,
      delta: js.UndefOr[scala.Nothing],
      callback: js.UndefOr[scala.Nothing],
      scope: js.Any
    ): Unit = js.native
    def drag(
      source: js.Any,
      target: js.Any,
      delta: js.UndefOr[scala.Nothing],
      callback: js.UndefOr[scala.Nothing],
      scope: js.Any,
      options: js.Any
    ): Unit = js.native
    def drag(source: js.Any, target: js.Any, delta: js.UndefOr[scala.Nothing], callback: js.Function): Unit = js.native
    def drag(
      source: js.Any,
      target: js.Any,
      delta: js.UndefOr[scala.Nothing],
      callback: js.Function,
      scope: js.UndefOr[scala.Nothing],
      options: js.Any
    ): Unit = js.native
    def drag(
      source: js.Any,
      target: js.Any,
      delta: js.UndefOr[scala.Nothing],
      callback: js.Function,
      scope: js.Any
    ): Unit = js.native
    def drag(
      source: js.Any,
      target: js.Any,
      delta: js.UndefOr[scala.Nothing],
      callback: js.Function,
      scope: js.Any,
      options: js.Any
    ): Unit = js.native
    def drag(source: js.Any, target: js.Any, delta: js.Array[Double]): Unit = js.native
    def drag(
      source: js.Any,
      target: js.Any,
      delta: js.Array[Double],
      callback: js.UndefOr[scala.Nothing],
      scope: js.UndefOr[scala.Nothing],
      options: js.Any
    ): Unit = js.native
    def drag(
      source: js.Any,
      target: js.Any,
      delta: js.Array[Double],
      callback: js.UndefOr[scala.Nothing],
      scope: js.Any
    ): Unit = js.native
    def drag(
      source: js.Any,
      target: js.Any,
      delta: js.Array[Double],
      callback: js.UndefOr[scala.Nothing],
      scope: js.Any,
      options: js.Any
    ): Unit = js.native
    def drag(source: js.Any, target: js.Any, delta: js.Array[Double], callback: js.Function): Unit = js.native
    def drag(
      source: js.Any,
      target: js.Any,
      delta: js.Array[Double],
      callback: js.Function,
      scope: js.UndefOr[scala.Nothing],
      options: js.Any
    ): Unit = js.native
    def drag(source: js.Any, target: js.Any, delta: js.Array[Double], callback: js.Function, scope: js.Any): Unit = js.native
    def drag(
      source: js.Any,
      target: js.Any,
      delta: js.Array[Double],
      callback: js.Function,
      scope: js.Any,
      options: js.Any
    ): Unit = js.native
    
    def dragBy(source: js.Any, delta: js.Array[Double]): Unit = js.native
    def dragBy(
      source: js.Any,
      delta: js.Array[Double],
      callback: js.UndefOr[scala.Nothing],
      scope: js.UndefOr[scala.Nothing],
      options: js.UndefOr[scala.Nothing],
      dragOnly: Boolean
    ): Unit = js.native
    def dragBy(
      source: js.Any,
      delta: js.Array[Double],
      callback: js.UndefOr[scala.Nothing],
      scope: js.UndefOr[scala.Nothing],
      options: js.Any
    ): Unit = js.native
    def dragBy(
      source: js.Any,
      delta: js.Array[Double],
      callback: js.UndefOr[scala.Nothing],
      scope: js.UndefOr[scala.Nothing],
      options: js.Any,
      dragOnly: Boolean
    ): Unit = js.native
    def dragBy(source: js.Any, delta: js.Array[Double], callback: js.UndefOr[scala.Nothing], scope: js.Any): Unit = js.native
    def dragBy(
      source: js.Any,
      delta: js.Array[Double],
      callback: js.UndefOr[scala.Nothing],
      scope: js.Any,
      options: js.UndefOr[scala.Nothing],
      dragOnly: Boolean
    ): Unit = js.native
    def dragBy(
      source: js.Any,
      delta: js.Array[Double],
      callback: js.UndefOr[scala.Nothing],
      scope: js.Any,
      options: js.Any
    ): Unit = js.native
    def dragBy(
      source: js.Any,
      delta: js.Array[Double],
      callback: js.UndefOr[scala.Nothing],
      scope: js.Any,
      options: js.Any,
      dragOnly: Boolean
    ): Unit = js.native
    def dragBy(source: js.Any, delta: js.Array[Double], callback: js.Function): Unit = js.native
    def dragBy(
      source: js.Any,
      delta: js.Array[Double],
      callback: js.Function,
      scope: js.UndefOr[scala.Nothing],
      options: js.UndefOr[scala.Nothing],
      dragOnly: Boolean
    ): Unit = js.native
    def dragBy(
      source: js.Any,
      delta: js.Array[Double],
      callback: js.Function,
      scope: js.UndefOr[scala.Nothing],
      options: js.Any
    ): Unit = js.native
    def dragBy(
      source: js.Any,
      delta: js.Array[Double],
      callback: js.Function,
      scope: js.UndefOr[scala.Nothing],
      options: js.Any,
      dragOnly: Boolean
    ): Unit = js.native
    def dragBy(source: js.Any, delta: js.Array[Double], callback: js.Function, scope: js.Any): Unit = js.native
    def dragBy(
      source: js.Any,
      delta: js.Array[Double],
      callback: js.Function,
      scope: js.Any,
      options: js.UndefOr[scala.Nothing],
      dragOnly: Boolean
    ): Unit = js.native
    def dragBy(source: js.Any, delta: js.Array[Double], callback: js.Function, scope: js.Any, options: js.Any): Unit = js.native
    def dragBy(
      source: js.Any,
      delta: js.Array[Double],
      callback: js.Function,
      scope: js.Any,
      options: js.Any,
      dragOnly: Boolean
    ): Unit = js.native
    
    var dragDelay: Double = js.native
    
    var dragPrecision: Double = js.native
    
    def dragTo(source: js.Any, target: js.Any): Unit = js.native
    def dragTo(
      source: js.Any,
      target: js.Any,
      callback: js.UndefOr[scala.Nothing],
      scope: js.UndefOr[scala.Nothing],
      options: js.UndefOr[scala.Nothing],
      dragOnly: Boolean
    ): Unit = js.native
    def dragTo(
      source: js.Any,
      target: js.Any,
      callback: js.UndefOr[scala.Nothing],
      scope: js.UndefOr[scala.Nothing],
      options: js.Any
    ): Unit = js.native
    def dragTo(
      source: js.Any,
      target: js.Any,
      callback: js.UndefOr[scala.Nothing],
      scope: js.UndefOr[scala.Nothing],
      options: js.Any,
      dragOnly: Boolean
    ): Unit = js.native
    def dragTo(source: js.Any, target: js.Any, callback: js.UndefOr[scala.Nothing], scope: js.Any): Unit = js.native
    def dragTo(
      source: js.Any,
      target: js.Any,
      callback: js.UndefOr[scala.Nothing],
      scope: js.Any,
      options: js.UndefOr[scala.Nothing],
      dragOnly: Boolean
    ): Unit = js.native
    def dragTo(
      source: js.Any,
      target: js.Any,
      callback: js.UndefOr[scala.Nothing],
      scope: js.Any,
      options: js.Any
    ): Unit = js.native
    def dragTo(
      source: js.Any,
      target: js.Any,
      callback: js.UndefOr[scala.Nothing],
      scope: js.Any,
      options: js.Any,
      dragOnly: Boolean
    ): Unit = js.native
    def dragTo(source: js.Any, target: js.Any, callback: js.Function): Unit = js.native
    def dragTo(
      source: js.Any,
      target: js.Any,
      callback: js.Function,
      scope: js.UndefOr[scala.Nothing],
      options: js.UndefOr[scala.Nothing],
      dragOnly: Boolean
    ): Unit = js.native
    def dragTo(
      source: js.Any,
      target: js.Any,
      callback: js.Function,
      scope: js.UndefOr[scala.Nothing],
      options: js.Any
    ): Unit = js.native
    def dragTo(
      source: js.Any,
      target: js.Any,
      callback: js.Function,
      scope: js.UndefOr[scala.Nothing],
      options: js.Any,
      dragOnly: Boolean
    ): Unit = js.native
    def dragTo(source: js.Any, target: js.Any, callback: js.Function, scope: js.Any): Unit = js.native
    def dragTo(
      source: js.Any,
      target: js.Any,
      callback: js.Function,
      scope: js.Any,
      options: js.UndefOr[scala.Nothing],
      dragOnly: Boolean
    ): Unit = js.native
    def dragTo(source: js.Any, target: js.Any, callback: js.Function, scope: js.Any, options: js.Any): Unit = js.native
    def dragTo(
      source: js.Any,
      target: js.Any,
      callback: js.Function,
      scope: js.Any,
      options: js.Any,
      dragOnly: Boolean
    ): Unit = js.native
    
    def mouseDown(el: js.Any, options: js.Any): Unit = js.native
    
    def mouseOut(el: js.Any, options: js.Any): Unit = js.native
    
    def mouseOver(el: js.Any, options: js.Any): Unit = js.native
    
    def mouseUp(el: js.Any, options: js.Any): Unit = js.native
    
    var moveCursorBetweenPoints: Boolean = js.native
    
    def moveCursorBy(delta: js.Array[Double]): Unit = js.native
    def moveCursorBy(delta: js.Array[Double], callback: js.UndefOr[scala.Nothing], scope: js.Any): Unit = js.native
    def moveCursorBy(delta: js.Array[Double], callback: js.Function): Unit = js.native
    def moveCursorBy(delta: js.Array[Double], callback: js.Function, scope: js.Any): Unit = js.native
    
    def moveCursorTo(): Unit = js.native
    def moveCursorTo(target: js.UndefOr[scala.Nothing], callback: js.UndefOr[scala.Nothing], scope: js.Any): Unit = js.native
    def moveCursorTo(target: js.UndefOr[scala.Nothing], callback: js.Function): Unit = js.native
    def moveCursorTo(target: js.UndefOr[scala.Nothing], callback: js.Function, scope: js.Any): Unit = js.native
    def moveCursorTo(target: js.Any): Unit = js.native
    def moveCursorTo(target: js.Any, callback: js.UndefOr[scala.Nothing], scope: js.Any): Unit = js.native
    def moveCursorTo(target: js.Any, callback: js.Function): Unit = js.native
    def moveCursorTo(target: js.Any, callback: js.Function, scope: js.Any): Unit = js.native
    
    def moveMouseBy(delta: js.Array[Double]): Unit = js.native
    def moveMouseBy(delta: js.Array[Double], callback: js.UndefOr[scala.Nothing], scope: js.Any): Unit = js.native
    def moveMouseBy(delta: js.Array[Double], callback: js.Function): Unit = js.native
    def moveMouseBy(delta: js.Array[Double], callback: js.Function, scope: js.Any): Unit = js.native
    
    def moveMouseTo(): Unit = js.native
    def moveMouseTo(target: js.UndefOr[scala.Nothing], callback: js.UndefOr[scala.Nothing], scope: js.Any): Unit = js.native
    def moveMouseTo(target: js.UndefOr[scala.Nothing], callback: js.Function): Unit = js.native
    def moveMouseTo(target: js.UndefOr[scala.Nothing], callback: js.Function, scope: js.Any): Unit = js.native
    def moveMouseTo(target: js.Any): Unit = js.native
    def moveMouseTo(target: js.Any, callback: js.UndefOr[scala.Nothing], scope: js.Any): Unit = js.native
    def moveMouseTo(target: js.Any, callback: js.Function): Unit = js.native
    def moveMouseTo(target: js.Any, callback: js.Function, scope: js.Any): Unit = js.native
    
    def rightClick(): Unit = js.native
    def rightClick(callback: js.UndefOr[scala.Nothing], scope: js.Any): Unit = js.native
    def rightClick(callback: js.UndefOr[scala.Nothing], scope: js.Any, options: js.Any): Unit = js.native
    def rightClick(callback: js.Function): Unit = js.native
    def rightClick(callback: js.Function, scope: js.UndefOr[scala.Nothing], options: js.Any): Unit = js.native
    def rightClick(callback: js.Function, scope: js.Any): Unit = js.native
    def rightClick(callback: js.Function, scope: js.Any, options: js.Any): Unit = js.native
    def rightClick(
      el: js.UndefOr[scala.Nothing],
      callback: js.UndefOr[scala.Nothing],
      scope: js.UndefOr[scala.Nothing],
      options: js.Any
    ): Unit = js.native
    def rightClick(el: js.UndefOr[scala.Nothing], callback: js.UndefOr[scala.Nothing], scope: js.Any): Unit = js.native
    def rightClick(el: js.UndefOr[scala.Nothing], callback: js.UndefOr[scala.Nothing], scope: js.Any, options: js.Any): Unit = js.native
    def rightClick(el: js.UndefOr[scala.Nothing], callback: js.Function): Unit = js.native
    def rightClick(
      el: js.UndefOr[scala.Nothing],
      callback: js.Function,
      scope: js.UndefOr[scala.Nothing],
      options: js.Any
    ): Unit = js.native
    def rightClick(el: js.UndefOr[scala.Nothing], callback: js.Function, scope: js.Any): Unit = js.native
    def rightClick(el: js.UndefOr[scala.Nothing], callback: js.Function, scope: js.Any, options: js.Any): Unit = js.native
    def rightClick(el: js.Any): Unit = js.native
    def rightClick(el: js.Any, callback: js.UndefOr[scala.Nothing], scope: js.UndefOr[scala.Nothing], options: js.Any): Unit = js.native
    def rightClick(el: js.Any, callback: js.UndefOr[scala.Nothing], scope: js.Any): Unit = js.native
    def rightClick(el: js.Any, callback: js.UndefOr[scala.Nothing], scope: js.Any, options: js.Any): Unit = js.native
    def rightClick(el: js.Any, callback: js.Function): Unit = js.native
    def rightClick(el: js.Any, callback: js.Function, scope: js.UndefOr[scala.Nothing], options: js.Any): Unit = js.native
    def rightClick(el: js.Any, callback: js.Function, scope: js.Any): Unit = js.native
    def rightClick(el: js.Any, callback: js.Function, scope: js.Any, options: js.Any): Unit = js.native
  }
}
