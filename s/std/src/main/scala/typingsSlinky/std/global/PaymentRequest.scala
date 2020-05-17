package typingsSlinky.std.global

import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Instantiable3
import typingsSlinky.std.PaymentDetailsInit
import typingsSlinky.std.PaymentMethodData
import typingsSlinky.std.PaymentOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("PaymentRequest")
@js.native
class PaymentRequest protected ()
  extends typingsSlinky.std.PaymentRequest {
  def this(methodData: js.Array[PaymentMethodData], details: PaymentDetailsInit) = this()
  def this(methodData: js.Array[PaymentMethodData], details: PaymentDetailsInit, options: PaymentOptions) = this()
}

@JSGlobal("PaymentRequest")
@js.native
object PaymentRequest
  extends Instantiable2[
      /* methodData */ js.Array[PaymentMethodData], 
      /* details */ PaymentDetailsInit, 
      typingsSlinky.std.PaymentRequest
    ]
     with Instantiable3[
      /* methodData */ js.Array[PaymentMethodData], 
      /* details */ PaymentDetailsInit, 
      /* options */ PaymentOptions, 
      typingsSlinky.std.PaymentRequest
    ]

