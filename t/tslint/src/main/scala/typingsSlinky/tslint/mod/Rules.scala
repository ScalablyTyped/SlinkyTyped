package typingsSlinky.tslint.mod

import typingsSlinky.tslint.ruleMod.IOptions
import typingsSlinky.tslint.ruleMod.IRuleMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Rules {
  
  @JSImport("tslint", "Rules.AbstractRule")
  @js.native
  abstract class AbstractRule protected ()
    extends typingsSlinky.tslint.rulesMod.AbstractRule {
    def this(options: IOptions) = this()
  }
  /* static members */
  object AbstractRule {
    
    @JSImport("tslint", "Rules.AbstractRule")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("tslint", "Rules.AbstractRule.metadata")
    @js.native
    def metadata: IRuleMetadata = js.native
    @scala.inline
    def metadata_=(x: IRuleMetadata): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("metadata")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("tslint", "Rules.OptionallyTypedRule")
  @js.native
  abstract class OptionallyTypedRule protected ()
    extends typingsSlinky.tslint.rulesMod.OptionallyTypedRule {
    def this(options: IOptions) = this()
  }
  
  @JSImport("tslint", "Rules.TypedRule")
  @js.native
  abstract class TypedRule protected ()
    extends typingsSlinky.tslint.rulesMod.TypedRule {
    def this(options: IOptions) = this()
  }
}
