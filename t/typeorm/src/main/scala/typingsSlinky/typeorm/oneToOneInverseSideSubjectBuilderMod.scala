package typingsSlinky.typeorm

import typingsSlinky.typeorm.relationMetadataMod.RelationMetadata
import typingsSlinky.typeorm.subjectMod.Subject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object oneToOneInverseSideSubjectBuilderMod {
  
  @JSImport("typeorm/browser/persistence/subject-builder/OneToOneInverseSideSubjectBuilder", "OneToOneInverseSideSubjectBuilder")
  @js.native
  class OneToOneInverseSideSubjectBuilder protected () extends StObject {
    def this(subjects: js.Array[Subject]) = this()
    
    /**
      * Builds all required operations.
      */
    def build(): Unit = js.native
    
    /**
      * Builds operations for a given subject and relation.
      *
      * by example: subject is "post" entity we are saving here and relation is "category" inside it here.
      */
    /* protected */ def buildForSubjectRelation(subject: Subject, relation: RelationMetadata): Unit = js.native
    
    var subjects: js.Array[Subject] = js.native
  }
}
