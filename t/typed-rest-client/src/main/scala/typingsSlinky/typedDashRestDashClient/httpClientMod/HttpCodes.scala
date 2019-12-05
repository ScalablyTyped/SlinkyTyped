package typingsSlinky.typedDashRestDashClient.httpClientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait HttpCodes extends js.Object

@JSImport("typed-rest-client/HttpClient", "HttpCodes")
@js.native
object HttpCodes extends js.Object {
  @js.native
  sealed trait BadGateway extends HttpCodes
  
  @js.native
  sealed trait BadRequest extends HttpCodes
  
  @js.native
  sealed trait Conflict extends HttpCodes
  
  @js.native
  sealed trait Forbidden extends HttpCodes
  
  @js.native
  sealed trait GatewayTimeout extends HttpCodes
  
  @js.native
  sealed trait Gone extends HttpCodes
  
  @js.native
  sealed trait InternalServerError extends HttpCodes
  
  @js.native
  sealed trait MethodNotAllowed extends HttpCodes
  
  @js.native
  sealed trait MovedPermanently extends HttpCodes
  
  @js.native
  sealed trait MultipleChoices extends HttpCodes
  
  @js.native
  sealed trait NotAcceptable extends HttpCodes
  
  @js.native
  sealed trait NotFound extends HttpCodes
  
  @js.native
  sealed trait NotImplemented extends HttpCodes
  
  @js.native
  sealed trait NotModified extends HttpCodes
  
  @js.native
  sealed trait OK extends HttpCodes
  
  @js.native
  sealed trait PaymentRequired extends HttpCodes
  
  @js.native
  sealed trait PermanentRedirect extends HttpCodes
  
  @js.native
  sealed trait ProxyAuthenticationRequired extends HttpCodes
  
  @js.native
  sealed trait RequestTimeout extends HttpCodes
  
  @js.native
  sealed trait ResourceMoved extends HttpCodes
  
  @js.native
  sealed trait SeeOther extends HttpCodes
  
  @js.native
  sealed trait ServiceUnavailable extends HttpCodes
  
  @js.native
  sealed trait SwitchProxy extends HttpCodes
  
  @js.native
  sealed trait TemporaryRedirect extends HttpCodes
  
  @js.native
  sealed trait Unauthorized extends HttpCodes
  
  @js.native
  sealed trait UseProxy extends HttpCodes
  
  /* 502 */ val BadGateway: typingsSlinky.typedDashRestDashClient.httpClientMod.HttpCodes.BadGateway with Double = js.native
  /* 400 */ val BadRequest: typingsSlinky.typedDashRestDashClient.httpClientMod.HttpCodes.BadRequest with Double = js.native
  /* 409 */ val Conflict: typingsSlinky.typedDashRestDashClient.httpClientMod.HttpCodes.Conflict with Double = js.native
  /* 403 */ val Forbidden: typingsSlinky.typedDashRestDashClient.httpClientMod.HttpCodes.Forbidden with Double = js.native
  /* 504 */ val GatewayTimeout: typingsSlinky.typedDashRestDashClient.httpClientMod.HttpCodes.GatewayTimeout with Double = js.native
  /* 410 */ val Gone: typingsSlinky.typedDashRestDashClient.httpClientMod.HttpCodes.Gone with Double = js.native
  /* 500 */ val InternalServerError: typingsSlinky.typedDashRestDashClient.httpClientMod.HttpCodes.InternalServerError with Double = js.native
  /* 405 */ val MethodNotAllowed: typingsSlinky.typedDashRestDashClient.httpClientMod.HttpCodes.MethodNotAllowed with Double = js.native
  /* 301 */ val MovedPermanently: typingsSlinky.typedDashRestDashClient.httpClientMod.HttpCodes.MovedPermanently with Double = js.native
  /* 300 */ val MultipleChoices: typingsSlinky.typedDashRestDashClient.httpClientMod.HttpCodes.MultipleChoices with Double = js.native
  /* 406 */ val NotAcceptable: typingsSlinky.typedDashRestDashClient.httpClientMod.HttpCodes.NotAcceptable with Double = js.native
  /* 404 */ val NotFound: typingsSlinky.typedDashRestDashClient.httpClientMod.HttpCodes.NotFound with Double = js.native
  /* 501 */ val NotImplemented: typingsSlinky.typedDashRestDashClient.httpClientMod.HttpCodes.NotImplemented with Double = js.native
  /* 304 */ val NotModified: typingsSlinky.typedDashRestDashClient.httpClientMod.HttpCodes.NotModified with Double = js.native
  /* 200 */ val OK: typingsSlinky.typedDashRestDashClient.httpClientMod.HttpCodes.OK with Double = js.native
  /* 402 */ val PaymentRequired: typingsSlinky.typedDashRestDashClient.httpClientMod.HttpCodes.PaymentRequired with Double = js.native
  /* 308 */ val PermanentRedirect: typingsSlinky.typedDashRestDashClient.httpClientMod.HttpCodes.PermanentRedirect with Double = js.native
  /* 407 */ val ProxyAuthenticationRequired: typingsSlinky.typedDashRestDashClient.httpClientMod.HttpCodes.ProxyAuthenticationRequired with Double = js.native
  /* 408 */ val RequestTimeout: typingsSlinky.typedDashRestDashClient.httpClientMod.HttpCodes.RequestTimeout with Double = js.native
  /* 302 */ val ResourceMoved: typingsSlinky.typedDashRestDashClient.httpClientMod.HttpCodes.ResourceMoved with Double = js.native
  /* 303 */ val SeeOther: typingsSlinky.typedDashRestDashClient.httpClientMod.HttpCodes.SeeOther with Double = js.native
  /* 503 */ val ServiceUnavailable: typingsSlinky.typedDashRestDashClient.httpClientMod.HttpCodes.ServiceUnavailable with Double = js.native
  /* 306 */ val SwitchProxy: typingsSlinky.typedDashRestDashClient.httpClientMod.HttpCodes.SwitchProxy with Double = js.native
  /* 307 */ val TemporaryRedirect: typingsSlinky.typedDashRestDashClient.httpClientMod.HttpCodes.TemporaryRedirect with Double = js.native
  /* 401 */ val Unauthorized: typingsSlinky.typedDashRestDashClient.httpClientMod.HttpCodes.Unauthorized with Double = js.native
  /* 305 */ val UseProxy: typingsSlinky.typedDashRestDashClient.httpClientMod.HttpCodes.UseProxy with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[HttpCodes with Double] = js.native
}

