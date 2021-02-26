package typingsSlinky.swfobject

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Ie extends StObject {
    
    // number or boolean
    var ie: Boolean = js.native
    
    var mac: Boolean = js.native
    
    var pv: js.Array[Double] = js.native
    
    var w3: Boolean = js.native
    
    var win: Boolean = js.native
    
    var wk: js.Any = js.native
  }
  object Ie {
    
    @scala.inline
    def apply(ie: Boolean, mac: Boolean, pv: js.Array[Double], w3: Boolean, win: Boolean, wk: js.Any): Ie = {
      val __obj = js.Dynamic.literal(ie = ie.asInstanceOf[js.Any], mac = mac.asInstanceOf[js.Any], pv = pv.asInstanceOf[js.Any], w3 = w3.asInstanceOf[js.Any], win = win.asInstanceOf[js.Any], wk = wk.asInstanceOf[js.Any])
      __obj.asInstanceOf[Ie]
    }
    
    @scala.inline
    implicit class IeMutableBuilder[Self <: Ie] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIe(value: Boolean): Self = StObject.set(x, "ie", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMac(value: Boolean): Self = StObject.set(x, "mac", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPv(value: js.Array[Double]): Self = StObject.set(x, "pv", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPvVarargs(value: Double*): Self = StObject.set(x, "pv", js.Array(value :_*))
      
      @scala.inline
      def setW3(value: Boolean): Self = StObject.set(x, "w3", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWin(value: Boolean): Self = StObject.set(x, "win", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWk(value: js.Any): Self = StObject.set(x, "wk", value.asInstanceOf[js.Any])
    }
  }
}
