package typingsSlinky.wordpressCustomizeBrowser

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object classMod {
  
  @JSImport("@wordpress/customize-browser/Class", "Class")
  @js.native
  abstract class Class protected () extends StObject {
    def this(applicator: js.Object, argsArray: js.Object) = this()
    def this(applicator: js.Object, argsArray: js.Object, options: js.Object) = this()
    
    def extended(constructor: js.Object): Boolean = js.native
    
    def initialize(_underscore: js.Any*): Unit = js.native
  }
  /* static members */
  object Class {
    
    @JSImport("@wordpress/customize-browser/Class", "Class")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@wordpress/customize-browser/Class", "Class.applicator")
    @js.native
    def applicator: js.Object = js.native
    @scala.inline
    def applicator_=(x: js.Object): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("applicator")(x.asInstanceOf[js.Any])
    
    @JSImport("@wordpress/customize-browser/Class", "Class.extend")
    @js.native
    def extend(protoProps: js.Object, classProps: js.Object): Class = js.native
  }
}
