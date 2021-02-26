package typingsSlinky.uirouterAngularjs

import typingsSlinky.uirouterAngularjs.anon.Resolve
import typingsSlinky.uirouterAngularjs.stateDirectivesMod.ng1Directive
import typingsSlinky.uirouterAngularjs.viewsMod.Ng1ViewConfig
import typingsSlinky.uirouterCore.viewInterfaceMod.ActiveUIView
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object viewDirectiveMod {
  
  @JSImport("@uirouter/angularjs/lib/directives/viewDirective", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@uirouter/angularjs/lib/directives/viewDirective", "uiView")
  @js.native
  def uiView: ng1Directive = js.native
  @scala.inline
  def uiView_=(x: ng1Directive): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("uiView")(x.asInstanceOf[js.Any])
  
  @js.native
  trait UIViewAnimData extends StObject {
    
    @JSName("$animEnter")
    var $animEnter: js.Promise[_] = js.native
    
    @JSName("$animLeave")
    var $animLeave: js.Promise[_] = js.native
    
    @JSName("$$animLeave")
    var DollarDollaranimLeave: Resolve = js.native
  }
  object UIViewAnimData {
    
    @scala.inline
    def apply($animEnter: js.Promise[_], $animLeave: js.Promise[_], DollarDollaranimLeave: Resolve): UIViewAnimData = {
      val __obj = js.Dynamic.literal($animEnter = $animEnter.asInstanceOf[js.Any], $animLeave = $animLeave.asInstanceOf[js.Any])
      __obj.updateDynamic("$$animLeave")(DollarDollaranimLeave.asInstanceOf[js.Any])
      __obj.asInstanceOf[UIViewAnimData]
    }
    
    @scala.inline
    implicit class UIViewAnimDataMutableBuilder[Self <: UIViewAnimData] (val x: Self) extends AnyVal {
      
      @scala.inline
      def set$animEnter(value: js.Promise[_]): Self = StObject.set(x, "$animEnter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set$animLeave(value: js.Promise[_]): Self = StObject.set(x, "$animLeave", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDollarDollaranimLeave(value: Resolve): Self = StObject.set(x, "$$animLeave", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait UIViewData extends StObject {
    
    @JSName("$cfg")
    var $cfg: Ng1ViewConfig = js.native
    
    @JSName("$uiView")
    var $uiView: ActiveUIView = js.native
  }
  object UIViewData {
    
    @scala.inline
    def apply($cfg: Ng1ViewConfig, $uiView: ActiveUIView): UIViewData = {
      val __obj = js.Dynamic.literal($cfg = $cfg.asInstanceOf[js.Any], $uiView = $uiView.asInstanceOf[js.Any])
      __obj.asInstanceOf[UIViewData]
    }
    
    @scala.inline
    implicit class UIViewDataMutableBuilder[Self <: UIViewData] (val x: Self) extends AnyVal {
      
      @scala.inline
      def set$cfg(value: Ng1ViewConfig): Self = StObject.set(x, "$cfg", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set$uiView(value: ActiveUIView): Self = StObject.set(x, "$uiView", value.asInstanceOf[js.Any])
    }
  }
}
