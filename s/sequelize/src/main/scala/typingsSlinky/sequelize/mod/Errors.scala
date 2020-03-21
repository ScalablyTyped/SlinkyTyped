package typingsSlinky.sequelize.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Sequelize provides a host of custom error classes, to allow you to do easier debugging. All of these errors
  * are exposed on the sequelize object and the sequelize constructor. All sequelize errors inherit from the
  * base JS error object.
  */
@js.native
trait Errors extends js.Object {
  @JSName("AccessDeniedError")
  var AccessDeniedError_Original: AccessDeniedError = js.native
  @JSName("ConnectionError")
  var ConnectionError_Original: ConnectionError = js.native
  @JSName("ConnectionRefusedError")
  var ConnectionRefusedError_Original: ConnectionRefusedError = js.native
  @JSName("ConnectionTimedOutError")
  var ConnectionTimedOutError_Original: ConnectionTimedOutError = js.native
  @JSName("DatabaseError")
  var DatabaseError_Original: DatabaseError = js.native
  @JSName("EmptyResultError")
  var EmptyResultError_Original: EmptyResultError = js.native
  @JSName("Error")
  var Error_Original: BaseError = js.native
  @JSName("ExclusionConstraintError")
  var ExclusionConstraintError_Original: ExclusionConstraintError = js.native
  @JSName("ForeignKeyConstraintError")
  var ForeignKeyConstraintError_Original: ForeignKeyConstraintError = js.native
  @JSName("HostNotFoundError")
  var HostNotFoundError_Original: HostNotFoundError = js.native
  @JSName("HostNotReachableError")
  var HostNotReachableError_Original: HostNotReachableError = js.native
  @JSName("InvalidConnectionError")
  var InvalidConnectionError_Original: InvalidConnectionError = js.native
  @JSName("TimeoutError")
  var TimeoutError_Original: TimeoutError = js.native
  @JSName("UniqueConstraintError")
  var UniqueConstraintError_Original: UniqueConstraintError = js.native
  @JSName("ValidationErrorItem")
  var ValidationErrorItem_Original: ValidationErrorItem = js.native
  @JSName("ValidationError")
  var ValidationError_Original: ValidationError = js.native
  def AccessDeniedError(): js.Error = js.native
  def AccessDeniedError(message: String): js.Error = js.native
  def ConnectionError(): js.Error = js.native
  def ConnectionError(message: String): js.Error = js.native
  def ConnectionRefusedError(): js.Error = js.native
  def ConnectionRefusedError(message: String): js.Error = js.native
  def ConnectionTimedOutError(): js.Error = js.native
  def ConnectionTimedOutError(message: String): js.Error = js.native
  def DatabaseError(): js.Error = js.native
  def DatabaseError(message: String): js.Error = js.native
  def EmptyResultError(): js.Error = js.native
  def EmptyResultError(message: String): js.Error = js.native
  def Error(): js.Error = js.native
  def Error(message: String): js.Error = js.native
  def ExclusionConstraintError(): js.Error = js.native
  def ExclusionConstraintError(message: String): js.Error = js.native
  def ForeignKeyConstraintError(): js.Error = js.native
  def ForeignKeyConstraintError(message: String): js.Error = js.native
  def HostNotFoundError(): js.Error = js.native
  def HostNotFoundError(message: String): js.Error = js.native
  def HostNotReachableError(): js.Error = js.native
  def HostNotReachableError(message: String): js.Error = js.native
  def InvalidConnectionError(): js.Error = js.native
  def InvalidConnectionError(message: String): js.Error = js.native
  def TimeoutError(): js.Error = js.native
  def TimeoutError(message: String): js.Error = js.native
  def UniqueConstraintError(): js.Error = js.native
  def UniqueConstraintError(message: String): js.Error = js.native
  def ValidationError(): js.Error = js.native
  def ValidationError(message: String): js.Error = js.native
  def ValidationErrorItem(): js.Error = js.native
  def ValidationErrorItem(message: String): js.Error = js.native
}

