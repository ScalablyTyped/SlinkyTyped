package typingsSlinky.typeorm

import typingsSlinky.typeorm.metadataEntityMetadataMod.EntityMetadata
import typingsSlinky.typeorm.persistenceSubjectMod.Subject
import typingsSlinky.typeorm.typeormStrings.delete
import typingsSlinky.typeorm.typeormStrings.insert
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typeorm/persistence/SubjectTopoligicalSorter", JSImport.Namespace)
@js.native
object persistenceSubjectTopoligicalSorterMod extends js.Object {
  
  @js.native
  class SubjectTopoligicalSorter protected () extends js.Object {
    def this(subjects: js.Array[Subject]) = this()
    
    /**
      * Gets dependency tree for all entity metadatas with non-nullable relations.
      * We need to execute insertions first for entities which non-nullable relations.
      */
    /* protected */ def getDependencies(): js.Array[js.Array[String]] = js.native
    
    /**
      * Gets dependency tree for all entity metadatas with non-nullable relations.
      * We need to execute insertions first for entities which non-nullable relations.
      */
    /* protected */ def getNonNullableDependencies(): js.Array[js.Array[String]] = js.native
    
    /**
      * Extracts all unique metadatas from the given subjects.
      */
    /* protected */ def getUniqueMetadatas(subjects: js.Array[Subject]): js.Array[EntityMetadata] = js.native
    
    /**
      * Unique list of entity metadatas of this subject.
      */
    var metadatas: js.Array[EntityMetadata] = js.native
    
    /**
      * Removes already sorted subjects from this.subjects list of subjects.
      */
    /* protected */ def removeAlreadySorted(subjects: js.Array[Subject]): Unit = js.native
    
    @JSName("sort")
    def sort_delete(direction: delete): js.Array[Subject] = js.native
    /**
      * Sorts (orders) subjects in their topological order.
      */
    @JSName("sort")
    def sort_insert(direction: insert): js.Array[Subject] = js.native
    
    /**
      * Insert subjects needs to be sorted.
      */
    var subjects: js.Array[Subject] = js.native
    
    /**
      * Sorts given graph using topological sorting algorithm.
      *
      * Algorithm is kindly taken from https://github.com/marcelklehr/toposort repository.
      */
    /* protected */ def toposort(edges: js.Array[js.Array[_]]): js.Array[_] = js.native
  }
}
