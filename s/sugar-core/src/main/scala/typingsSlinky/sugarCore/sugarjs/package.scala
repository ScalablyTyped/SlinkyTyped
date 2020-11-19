package typingsSlinky.sugarCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object sugarjs {
  
  type NativeConstructor = typingsSlinky.std.ArrayConstructor | typingsSlinky.std.DateConstructor | typingsSlinky.std.FunctionConstructor | typingsSlinky.std.NumberConstructor | typingsSlinky.std.ObjectConstructor | typingsSlinky.std.RegExpConstructor | typingsSlinky.std.StringConstructor | typingsSlinky.std.BooleanConstructor | typingsSlinky.std.ErrorConstructor
  
  type SugarDefaultChainable[RawValue] = (typingsSlinky.sugarCore.sugarjs.Array.Chainable[_, RawValue]) with typingsSlinky.sugarCore.sugarjs.Date.Chainable[RawValue] with typingsSlinky.sugarCore.sugarjs.Function.Chainable[RawValue] with typingsSlinky.sugarCore.sugarjs.Number.Chainable[RawValue] with typingsSlinky.sugarCore.sugarjs.Object.Chainable[RawValue] with typingsSlinky.sugarCore.sugarjs.RegExp.Chainable[RawValue] with typingsSlinky.sugarCore.sugarjs.String.Chainable[RawValue]
}
