package typingsSlinky.wordwrap

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * Pad out lines with spaces out to column `start` and then wrap until column
    * `stop`. If a word is longer than `stop - start` characters it will overflow.
    */
  @JSImport("wordwrap", JSImport.Namespace)
  @js.native
  def apply(params: Options): Wrap = js.native
  /**
    * Pad out lines with spaces out to column `start` and then wrap until column
    * `stop`. If a word is longer than `stop - start` characters it will overflow.
    */
  @JSImport("wordwrap", JSImport.Namespace)
  @js.native
  def apply(start: Double, stop: Double): Wrap = js.native
  @JSImport("wordwrap", JSImport.Namespace)
  @js.native
  def apply(start: Double, stop: Double, params: typingsSlinky.wordwrap.anon.Mode): Wrap = js.native
  /**
    * Wrap lines until column `stop`. If a word is longer than `stop` characters
    * it will overflow.
    */
  @JSImport("wordwrap", JSImport.Namespace)
  @js.native
  def apply(stop: Double): Wrap = js.native
  @JSImport("wordwrap", JSImport.Namespace)
  @js.native
  def apply(stop: Double, params: typingsSlinky.wordwrap.anon.Mode): Wrap = js.native
  
  /**
    * Wrap lines until column `stop`. Break up chunks longer than `stop - start`.
    */
  @JSImport("wordwrap", "hard")
  @js.native
  def hard(start: Double, stop: Double): Wrap = js.native
  /**
    * Wrap lines until column `stop`. Break up chunks longer than `stop`.
    */
  @JSImport("wordwrap", "hard")
  @js.native
  def hard(stop: Double): Wrap = js.native
  
  // tslint:disable-line:unified-signatures
  /**
    * In "soft" mode, split chunks by `/(\S+\s+/` and don't break up chunks
    * which are longer than `stop - start`, in "hard" mode, split chunks with
    * `/\b/` and break up chunks longer than `stop - start`.
    */
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.wordwrap.wordwrapStrings.soft
    - typingsSlinky.wordwrap.wordwrapStrings.hard
  */
  trait Mode extends StObject
  object Mode {
    
    @scala.inline
    def hard: typingsSlinky.wordwrap.wordwrapStrings.hard = "hard".asInstanceOf[typingsSlinky.wordwrap.wordwrapStrings.hard]
    
    @scala.inline
    def soft: typingsSlinky.wordwrap.wordwrapStrings.soft = "soft".asInstanceOf[typingsSlinky.wordwrap.wordwrapStrings.soft]
  }
  
  @js.native
  trait Options extends StObject {
    
    var mode: js.UndefOr[Mode] = js.native
    
    var start: Double = js.native
    
    var stop: Double = js.native
  }
  object Options {
    
    @scala.inline
    def apply(start: Double, stop: Double): Options = {
      val __obj = js.Dynamic.literal(start = start.asInstanceOf[js.Any], stop = stop.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMode(value: Mode): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
      
      @scala.inline
      def setStart(value: Double): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStop(value: Double): Self = StObject.set(x, "stop", value.asInstanceOf[js.Any])
    }
  }
  
  type Wrap = js.Function1[/* text */ String, String]
}
