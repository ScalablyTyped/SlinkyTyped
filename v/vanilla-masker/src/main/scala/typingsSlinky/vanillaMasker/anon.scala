package typingsSlinky.vanillaMasker

import typingsSlinky.vanillaMasker.mod.MoneyOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobalScope
@js.native
object anon extends js.Object {
  
  @js.native
  trait MaskAlphaNum extends js.Object {
    
    def maskAlphaNum(): Unit = js.native
    
    def maskMoney(): Unit = js.native
    def maskMoney(options: MoneyOptions): Unit = js.native
    
    def maskNumber(): Unit = js.native
    
    def maskPattern(pattern: String): Unit = js.native
    
    def unMask(): Unit = js.native
  }
}
