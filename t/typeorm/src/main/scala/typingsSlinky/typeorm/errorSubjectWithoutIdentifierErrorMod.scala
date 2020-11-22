package typingsSlinky.typeorm

import typingsSlinky.std.Error
import typingsSlinky.typeorm.persistenceSubjectMod.Subject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typeorm/error/SubjectWithoutIdentifierError", JSImport.Namespace)
@js.native
object errorSubjectWithoutIdentifierErrorMod extends js.Object {
  
  @js.native
  class SubjectWithoutIdentifierError protected () extends Error {
    def this(subject: Subject) = this()
  }
}
