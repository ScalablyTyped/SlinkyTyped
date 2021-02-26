package typingsSlinky.sparkly

import typingsSlinky.sparkly.sparklyStrings._empty
import typingsSlinky.sparkly.sparklyStrings.fire
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
  Generate sparklines `▁▂▃▅▂▇`.
  @param numbers - Numbers to create the sparkline from.
  @example
  ```
  const sparkly = require('sparkly');
  sparkly([0, 3, 5, 8, 4, 3, 4, 10]);
  //=> '▁▃▄▇▄▃▄█'
  // Specifying anything other than finite numbers will cause holes
  sparkly([0, 3, 5, '', 4, 3, 4, 10]);
  //=> '▁▃▄ ▄▃▄█'
  // Specifying an object with minimum and maximum options will change the sparkline range
  sparkly([1, 2, 3, 4, 5], {minimum: 0, maximum: 10});
  //=> '▁▂▃▄▄'
  ```
  */
  @JSImport("sparkly", JSImport.Namespace)
  @js.native
  def apply(numbers: js.Array[Double | _empty]): String = js.native
  @JSImport("sparkly", JSImport.Namespace)
  @js.native
  def apply(numbers: js.Array[Double | _empty], options: Options): String = js.native
  
  @js.native
  trait Options extends StObject {
    
    /**
    		Maximum range.
    		*/
    val maximum: js.UndefOr[Double] = js.native
    
    /**
    		Minimum range.
    		*/
    val minimum: js.UndefOr[Double] = js.native
    
    /**
    		Style for the sparklines.
    		*/
    val style: js.UndefOr[fire] = js.native
  }
  object Options {
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMaximum(value: Double): Self = StObject.set(x, "maximum", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaximumUndefined: Self = StObject.set(x, "maximum", js.undefined)
      
      @scala.inline
      def setMinimum(value: Double): Self = StObject.set(x, "minimum", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinimumUndefined: Self = StObject.set(x, "minimum", js.undefined)
      
      @scala.inline
      def setStyle(value: fire): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
}
