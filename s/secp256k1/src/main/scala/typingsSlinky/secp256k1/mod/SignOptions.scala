package typingsSlinky.secp256k1.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SignOptions extends js.Object {
  /**
    * Additional data for noncefn (RFC 6979 3.6) (32 bytes).
    *
    * By default is `null`.
    */
  var data: js.UndefOr[js.typedarray.Uint8Array] = js.undefined
  /** Nonce generator. By default it is rfc6979 */
  var noncefn: js.UndefOr[
    js.Function5[
      /* message */ js.typedarray.Uint8Array, 
      /* privateKey */ js.typedarray.Uint8Array, 
      /* algo */ js.typedarray.Uint8Array | Null, 
      /* data */ js.typedarray.Uint8Array | Null, 
      /* attempt */ Double, 
      js.typedarray.Uint8Array
    ]
  ] = js.undefined
}

object SignOptions {
  @scala.inline
  def apply(
    data: js.typedarray.Uint8Array = null,
    noncefn: (/* message */ js.typedarray.Uint8Array, /* privateKey */ js.typedarray.Uint8Array, /* algo */ js.typedarray.Uint8Array | Null, /* data */ js.typedarray.Uint8Array | Null, /* attempt */ Double) => js.typedarray.Uint8Array = null
  ): SignOptions = {
    val __obj = js.Dynamic.literal()
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (noncefn != null) __obj.updateDynamic("noncefn")(js.Any.fromFunction5(noncefn))
    __obj.asInstanceOf[SignOptions]
  }
}

