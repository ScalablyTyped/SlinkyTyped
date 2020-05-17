package typingsSlinky.winrtUwp.Windows.Globalization.Collation

import typingsSlinky.std.Array
import typingsSlinky.winrtUwp.Windows.Foundation.Collections.IIterator
import typingsSlinky.winrtUwp.anon.Index
import typingsSlinky.winrtUwp.anon.ItemsCharacterGrouping
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Contains the set of character groups and the functionality to get the label for any given string. */
@js.native
trait CharacterGroupings extends Array[CharacterGrouping] {
  /** Gets the number of CharacterGrouping objects in the set of character groups. */
  var size: Double = js.native
  /**
    * Returns an iterator to enumerate the items in the set of character groups.
    * @return The iterator. The current position of the iterator is index 0, or the end of the set of character groups if the set is empty.
    */
  def first(): IIterator[CharacterGrouping] = js.native
  /**
    * Returns the CharacterGrouping at the specified index in the set of character groups.
    * @param index The zero-based index of the CharacterGrouping in the set to return.
    * @return The CharacterGrouping at the specified index.
    */
  def getAt(index: Double): CharacterGrouping = js.native
  /**
    * Returns the CharacterGrouping objects that start at the specified index in the set of character groups.
    * @param startIndex The zero-based index of the start of the CharacterGrouping objects in the set to return.
    */
  def getMany(startIndex: Double): ItemsCharacterGrouping = js.native
  def indexOf(value: CharacterGrouping, extra: js.Any*): Index = js.native
  /**
    * Returns the index of a specified CharacterGrouping object in the set of character groups.
    * @param value The CharacterGrouping object to find in the set.
    */
  @JSName("indexOf")
  def indexOf_Index(value: CharacterGrouping): Index = js.native
  /**
    * Gets the label under which the provided text falls.
    * @param text The string for which to get the label.
    * @return The first character grouping label that applies to the given text.
    */
  def lookup(text: String): String = js.native
}

