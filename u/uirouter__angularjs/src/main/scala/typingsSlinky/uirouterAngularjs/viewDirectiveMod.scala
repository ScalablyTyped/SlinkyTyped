package typingsSlinky.uirouterAngularjs

import typingsSlinky.uirouterAngularjs.stateDirectivesMod.ng1Directive
import typingsSlinky.uirouterAngularjs.viewsMod.Ng1ViewConfig
import typingsSlinky.uirouterCore.viewInterfaceMod.ActiveUIView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@uirouter/angularjs/lib/directives/viewDirective", JSImport.Namespace)
@js.native
object viewDirectiveMod extends js.Object {
  @js.native
  trait UIViewAnimData extends js.Object {
    @JSName("$animEnter")
    var $animEnter: js.Promise[_] = js.native
    @JSName("$animLeave")
    var $animLeave: js.Promise[_] = js.native
    @JSName("$$animLeave")
    var DollarDollaranimLeave: AnonResolve = js.native
  }
  
  @js.native
  trait UIViewData extends js.Object {
    @JSName("$cfg")
    var $cfg: Ng1ViewConfig = js.native
    @JSName("$uiView")
    var $uiView: ActiveUIView = js.native
  }
  
  var uiView: ng1Directive = js.native
}

