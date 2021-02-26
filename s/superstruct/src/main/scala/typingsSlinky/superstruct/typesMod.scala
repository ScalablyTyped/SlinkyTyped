package typingsSlinky.superstruct

import org.scalablytyped.runtime.TopLevel
import typingsSlinky.std.InstanceType
import typingsSlinky.std.Map
import typingsSlinky.std.Record
import typingsSlinky.std.Set
import typingsSlinky.superstruct.anon.Instantiable
import typingsSlinky.superstruct.structMod.Struct
import typingsSlinky.superstruct.superstructStrings.enums
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesMod {
  
  @JSImport("superstruct/lib/structs/types", "any")
  @js.native
  def any(): Struct[_, Null] = js.native
  
  @JSImport("superstruct/lib/structs/types", "array")
  @js.native
  def array(): Struct[js.Array[_], js.UndefOr[scala.Nothing]] = js.native
  @JSImport("superstruct/lib/structs/types", "array")
  @js.native
  def array[T /* <: Struct[_, _] */](Element: T): Struct[
    js.Array[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Infer<T> */ _
    ], 
    T
  ] = js.native
  
  @JSImport("superstruct/lib/structs/types", "boolean")
  @js.native
  def boolean(): Struct[Boolean, Null] = js.native
  
  @JSImport("superstruct/lib/structs/types", "date")
  @js.native
  def date(): Struct[js.Date, Null] = js.native
  
  @JSImport("superstruct/lib/structs/types", "enums")
  @js.native
  def enums[T /* <: Double */](values: js.Array[T]): Struct[
    T, 
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in std.Array<T>[number] ]: K}
    */ typingsSlinky.superstruct.superstructStrings.enums with TopLevel[js.Any]
  ] = js.native
  @JSImport("superstruct/lib/structs/types", "enums")
  @js.native
  def enums_T_String[T /* <: String */](values: js.Array[T]): Struct[
    T, 
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in std.Array<T>[number] ]: K}
    */ enums with TopLevel[js.Any]
  ] = js.native
  
  @JSImport("superstruct/lib/structs/types", "func")
  @js.native
  def func(): Struct[js.Function, Null] = js.native
  
  @JSImport("superstruct/lib/structs/types", "instance")
  @js.native
  def instance[T /* <: Instantiable */](Class: T): Struct[InstanceType[T], Null] = js.native
  
  @JSImport("superstruct/lib/structs/types", "integer")
  @js.native
  def integer(): Struct[Double, Null] = js.native
  
  @JSImport("superstruct/lib/structs/types", "intersection")
  @js.native
  def intersection[A](
    Structs: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify TupleSchema<[A]> */ js.Any
  ): Struct[A, Null] = js.native
  @JSImport("superstruct/lib/structs/types", "intersection")
  @js.native
  def intersection_AB[A, B](
    Structs: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify TupleSchema<[A, B]> */ js.Any
  ): Struct[A with B, Null] = js.native
  @JSImport("superstruct/lib/structs/types", "intersection")
  @js.native
  def intersection_ABC[A, B, C](
    Structs: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify TupleSchema<[A, B, C]> */ js.Any
  ): Struct[A with B with C, Null] = js.native
  @JSImport("superstruct/lib/structs/types", "intersection")
  @js.native
  def intersection_ABCD[A, B, C, D](
    Structs: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify TupleSchema<[A, B, C, D]> */ js.Any
  ): Struct[A with B with C with D, Null] = js.native
  @JSImport("superstruct/lib/structs/types", "intersection")
  @js.native
  def intersection_ABCDE[A, B, C, D, E](
    Structs: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify TupleSchema<[A, B, C, D, E]> */ js.Any
  ): Struct[A with B with C with D with E, Null] = js.native
  @JSImport("superstruct/lib/structs/types", "intersection")
  @js.native
  def intersection_ABCDEF[A, B, C, D, E, F](
    Structs: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify TupleSchema<[A, B, C, D, E, F]> */ js.Any
  ): Struct[A with B with C with D with E with F, Null] = js.native
  @JSImport("superstruct/lib/structs/types", "intersection")
  @js.native
  def intersection_ABCDEFG[A, B, C, D, E, F, G](
    Structs: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify TupleSchema<[A, B, C, D, E, F, G]> */ js.Any
  ): Struct[A with B with C with D with E with F with G, Null] = js.native
  @JSImport("superstruct/lib/structs/types", "intersection")
  @js.native
  def intersection_ABCDEFGH[A, B, C, D, E, F, G, H](
    Structs: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify TupleSchema<[A, B, C, D, E, F, G, H]> */ js.Any
  ): Struct[A with B with C with D with E with F with G with H, Null] = js.native
  @JSImport("superstruct/lib/structs/types", "intersection")
  @js.native
  def intersection_ABCDEFGHI[A, B, C, D, E, F, G, H, I](
    Structs: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify TupleSchema<[A, B, C, D, E, F, G, H, I]> */ js.Any
  ): Struct[A with B with C with D with E with F with G with H with I, Null] = js.native
  @JSImport("superstruct/lib/structs/types", "intersection")
  @js.native
  def intersection_ABCDEFGHIJ[A, B, C, D, E, F, G, H, I, J](
    Structs: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify TupleSchema<[A, B, C, D, E, F, G, H, I, J]> */ js.Any
  ): Struct[A with B with C with D with E with F with G with H with I with J, Null] = js.native
  @JSImport("superstruct/lib/structs/types", "intersection")
  @js.native
  def intersection_ABCDEFGHIJK[A, B, C, D, E, F, G, H, I, J, K](
    Structs: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify TupleSchema<[A, B, C, D, E, F, G, H, I, J, K]> */ js.Any
  ): Struct[A with B with C with D with E with F with G with H with I with J with K, Null] = js.native
  @JSImport("superstruct/lib/structs/types", "intersection")
  @js.native
  def intersection_ABCDEFGHIJKL[A, B, C, D, E, F, G, H, I, J, K, L](
    Structs: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify TupleSchema<[A, B, C, D, E, F, G, H, I, J, K, L]> */ js.Any
  ): Struct[
    A with B with C with D with E with F with G with H with I with J with K with L, 
    Null
  ] = js.native
  @JSImport("superstruct/lib/structs/types", "intersection")
  @js.native
  def intersection_ABCDEFGHIJKLM[A, B, C, D, E, F, G, H, I, J, K, L, M](
    Structs: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify TupleSchema<[A, B, C, D, E, F, G, H, I, J, K, L, M]> */ js.Any
  ): Struct[
    A with B with C with D with E with F with G with H with I with J with K with L with M, 
    Null
  ] = js.native
  @JSImport("superstruct/lib/structs/types", "intersection")
  @js.native
  def intersection_ABCDEFGHIJKLMN[A, B, C, D, E, F, G, H, I, J, K, L, M, N](
    Structs: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify TupleSchema<[A, B, C, D, E, F, G, H, I, J, K, L, M, N]> */ js.Any
  ): Struct[
    A with B with C with D with E with F with G with H with I with J with K with L with M with N, 
    Null
  ] = js.native
  @JSImport("superstruct/lib/structs/types", "intersection")
  @js.native
  def intersection_ABCDEFGHIJKLMNO[A, B, C, D, E, F, G, H, I, J, K, L, M, N, O](
    Structs: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify TupleSchema<[A, B, C, D, E, F, G, H, I, J, K, L, M, N, O]> */ js.Any
  ): Struct[
    A with B with C with D with E with F with G with H with I with J with K with L with M with N with O, 
    Null
  ] = js.native
  @JSImport("superstruct/lib/structs/types", "intersection")
  @js.native
  def intersection_ABCDEFGHIJKLMNOP[A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P](
    Structs: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify TupleSchema<[A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P]> */ js.Any
  ): Struct[
    A with B with C with D with E with F with G with H with I with J with K with L with M with N with O with P, 
    Null
  ] = js.native
  @JSImport("superstruct/lib/structs/types", "intersection")
  @js.native
  def intersection_ABCDEFGHIJKLMNOPQ[A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q](
    Structs: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify TupleSchema<[A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q]> */ js.Any
  ): Struct[
    A with B with C with D with E with F with G with H with I with J with K with L with M with N with O with P with Q, 
    Null
  ] = js.native
  
  @JSImport("superstruct/lib/structs/types", "literal")
  @js.native
  def literal[T /* <: Double */](constant: T): Struct[T, Null] = js.native
  @JSImport("superstruct/lib/structs/types", "literal")
  @js.native
  def literal_T[T](constant: T): Struct[T, Null] = js.native
  @JSImport("superstruct/lib/structs/types", "literal")
  @js.native
  def literal_T_Boolean[T /* <: Boolean */](constant: T): Struct[T, Null] = js.native
  @JSImport("superstruct/lib/structs/types", "literal")
  @js.native
  def literal_T_String[T /* <: String */](constant: T): Struct[T, Null] = js.native
  
  @JSImport("superstruct/lib/structs/types", "map")
  @js.native
  def map(): Struct[Map[_, _], Null] = js.native
  @JSImport("superstruct/lib/structs/types", "map")
  @js.native
  def map[K, V](Key: Struct[K, _], Value: Struct[V, _]): Struct[Map[K, V], Null] = js.native
  
  @JSImport("superstruct/lib/structs/types", "never")
  @js.native
  def never(): Struct[scala.Nothing, Null] = js.native
  
  @JSImport("superstruct/lib/structs/types", "nullable")
  @js.native
  def nullable[T, S](struct: Struct[T, S]): Struct[T | Null, S] = js.native
  
  @JSImport("superstruct/lib/structs/types", "number")
  @js.native
  def number(): Struct[Double, Null] = js.native
  
  @JSImport("superstruct/lib/structs/types", "optional")
  @js.native
  def optional[T, S](struct: Struct[T, S]): Struct[js.UndefOr[T], S] = js.native
  
  @JSImport("superstruct/lib/structs/types", "record")
  @js.native
  def record[K /* <: String */, V](Key: Struct[K, _], Value: Struct[V, _]): Struct[Record[K, V], Null] = js.native
  
  @JSImport("superstruct/lib/structs/types", "regexp")
  @js.native
  def regexp(): Struct[js.RegExp, Null] = js.native
  
  @JSImport("superstruct/lib/structs/types", "set")
  @js.native
  def set(): Struct[Set[_], Null] = js.native
  @JSImport("superstruct/lib/structs/types", "set")
  @js.native
  def set[T](Element: Struct[T, _]): Struct[Set[T], Null] = js.native
  
  @JSImport("superstruct/lib/structs/types", "shape")
  @js.native
  def shape[S /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObjectSchema */ js.Any */](schema: S): Struct[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObjectType<S> */ _, 
    S
  ] = js.native
  
  @JSImport("superstruct/lib/structs/types", "string")
  @js.native
  def string(): Struct[String, Null] = js.native
  
  @JSImport("superstruct/lib/structs/types", "tuple")
  @js.native
  def tuple[A](
    Structs: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify TupleSchema<[A]> */ js.Any
  ): Struct[A, Null] = js.native
  @JSImport("superstruct/lib/structs/types", "tuple")
  @js.native
  def tuple_AB[A, B](
    Structs: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify TupleSchema<[A, B]> */ js.Any
  ): Struct[js.Tuple2[A, B], Null] = js.native
  @JSImport("superstruct/lib/structs/types", "tuple")
  @js.native
  def tuple_ABC[A, B, C](
    Structs: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify TupleSchema<[A, B, C]> */ js.Any
  ): Struct[js.Tuple3[A, B, C], Null] = js.native
  @JSImport("superstruct/lib/structs/types", "tuple")
  @js.native
  def tuple_ABCD[A, B, C, D](
    Structs: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify TupleSchema<[A, B, C, D]> */ js.Any
  ): Struct[js.Tuple4[A, B, C, D], Null] = js.native
  @JSImport("superstruct/lib/structs/types", "tuple")
  @js.native
  def tuple_ABCDE[A, B, C, D, E](
    Structs: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify TupleSchema<[A, B, C, D, E]> */ js.Any
  ): Struct[js.Tuple5[A, B, C, D, E], Null] = js.native
  @JSImport("superstruct/lib/structs/types", "tuple")
  @js.native
  def tuple_ABCDEF[A, B, C, D, E, F](
    Structs: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify TupleSchema<[A, B, C, D, E, F]> */ js.Any
  ): Struct[js.Tuple6[A, B, C, D, E, F], Null] = js.native
  @JSImport("superstruct/lib/structs/types", "tuple")
  @js.native
  def tuple_ABCDEFG[A, B, C, D, E, F, G](
    Structs: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify TupleSchema<[A, B, C, D, E, F, G]> */ js.Any
  ): Struct[js.Tuple7[A, B, C, D, E, F, G], Null] = js.native
  @JSImport("superstruct/lib/structs/types", "tuple")
  @js.native
  def tuple_ABCDEFGH[A, B, C, D, E, F, G, H](
    Structs: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify TupleSchema<[A, B, C, D, E, F, G, H]> */ js.Any
  ): Struct[js.Tuple8[A, B, C, D, E, F, G, H], Null] = js.native
  @JSImport("superstruct/lib/structs/types", "tuple")
  @js.native
  def tuple_ABCDEFGHI[A, B, C, D, E, F, G, H, I](
    Structs: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify TupleSchema<[A, B, C, D, E, F, G, H, I]> */ js.Any
  ): Struct[js.Tuple9[A, B, C, D, E, F, G, H, I], Null] = js.native
  @JSImport("superstruct/lib/structs/types", "tuple")
  @js.native
  def tuple_ABCDEFGHIJ[A, B, C, D, E, F, G, H, I, J](
    Structs: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify TupleSchema<[A, B, C, D, E, F, G, H, I, J]> */ js.Any
  ): Struct[js.Tuple10[A, B, C, D, E, F, G, H, I, J], Null] = js.native
  @JSImport("superstruct/lib/structs/types", "tuple")
  @js.native
  def tuple_ABCDEFGHIJK[A, B, C, D, E, F, G, H, I, J, K](
    Structs: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify TupleSchema<[A, B, C, D, E, F, G, H, I, J, K]> */ js.Any
  ): Struct[js.Tuple11[A, B, C, D, E, F, G, H, I, J, K], Null] = js.native
  @JSImport("superstruct/lib/structs/types", "tuple")
  @js.native
  def tuple_ABCDEFGHIJKL[A, B, C, D, E, F, G, H, I, J, K, L](
    Structs: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify TupleSchema<[A, B, C, D, E, F, G, H, I, J, K, L]> */ js.Any
  ): Struct[js.Tuple12[A, B, C, D, E, F, G, H, I, J, K, L], Null] = js.native
  @JSImport("superstruct/lib/structs/types", "tuple")
  @js.native
  def tuple_ABCDEFGHIJKLM[A, B, C, D, E, F, G, H, I, J, K, L, M](
    Structs: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify TupleSchema<[A, B, C, D, E, F, G, H, I, J, K, L, M]> */ js.Any
  ): Struct[js.Tuple13[A, B, C, D, E, F, G, H, I, J, K, L, M], Null] = js.native
  @JSImport("superstruct/lib/structs/types", "tuple")
  @js.native
  def tuple_ABCDEFGHIJKLMN[A, B, C, D, E, F, G, H, I, J, K, L, M, N](
    Structs: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify TupleSchema<[A, B, C, D, E, F, G, H, I, J, K, L, M, N]> */ js.Any
  ): Struct[js.Tuple14[A, B, C, D, E, F, G, H, I, J, K, L, M, N], Null] = js.native
  @JSImport("superstruct/lib/structs/types", "tuple")
  @js.native
  def tuple_ABCDEFGHIJKLMNO[A, B, C, D, E, F, G, H, I, J, K, L, M, N, O](
    Structs: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify TupleSchema<[A, B, C, D, E, F, G, H, I, J, K, L, M, N, O]> */ js.Any
  ): Struct[js.Tuple15[A, B, C, D, E, F, G, H, I, J, K, L, M, N, O], Null] = js.native
  @JSImport("superstruct/lib/structs/types", "tuple")
  @js.native
  def tuple_ABCDEFGHIJKLMNOP[A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P](
    Structs: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify TupleSchema<[A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P]> */ js.Any
  ): Struct[js.Tuple16[A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P], Null] = js.native
  @JSImport("superstruct/lib/structs/types", "tuple")
  @js.native
  def tuple_ABCDEFGHIJKLMNOPQ[A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q](
    Structs: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify TupleSchema<[A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q]> */ js.Any
  ): Struct[js.Tuple17[A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q], Null] = js.native
  
  @JSImport("superstruct/lib/structs/types", "union")
  @js.native
  def union[A](
    Structs: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify TupleSchema<[A]> */ js.Any
  ): Struct[A, Null] = js.native
  @JSImport("superstruct/lib/structs/types", "union")
  @js.native
  def union_AB[A, B](
    Structs: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify TupleSchema<[A, B]> */ js.Any
  ): Struct[A | B, Null] = js.native
  @JSImport("superstruct/lib/structs/types", "union")
  @js.native
  def union_ABC[A, B, C](
    Structs: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify TupleSchema<[A, B, C]> */ js.Any
  ): Struct[A | B | C, Null] = js.native
  @JSImport("superstruct/lib/structs/types", "union")
  @js.native
  def union_ABCD[A, B, C, D](
    Structs: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify TupleSchema<[A, B, C, D]> */ js.Any
  ): Struct[A | B | C | D, Null] = js.native
  @JSImport("superstruct/lib/structs/types", "union")
  @js.native
  def union_ABCDE[A, B, C, D, E](
    Structs: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify TupleSchema<[A, B, C, D, E]> */ js.Any
  ): Struct[A | B | C | D | E, Null] = js.native
  @JSImport("superstruct/lib/structs/types", "union")
  @js.native
  def union_ABCDEF[A, B, C, D, E, F](
    Structs: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify TupleSchema<[A, B, C, D, E, F]> */ js.Any
  ): Struct[A | B | C | D | E | F, Null] = js.native
  @JSImport("superstruct/lib/structs/types", "union")
  @js.native
  def union_ABCDEFG[A, B, C, D, E, F, G](
    Structs: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify TupleSchema<[A, B, C, D, E, F, G]> */ js.Any
  ): Struct[A | B | C | D | E | F | G, Null] = js.native
  @JSImport("superstruct/lib/structs/types", "union")
  @js.native
  def union_ABCDEFGH[A, B, C, D, E, F, G, H](
    Structs: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify TupleSchema<[A, B, C, D, E, F, G, H]> */ js.Any
  ): Struct[A | B | C | D | E | F | G | H, Null] = js.native
  @JSImport("superstruct/lib/structs/types", "union")
  @js.native
  def union_ABCDEFGHI[A, B, C, D, E, F, G, H, I](
    Structs: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify TupleSchema<[A, B, C, D, E, F, G, H, I]> */ js.Any
  ): Struct[A | B | C | D | E | F | G | H | I, Null] = js.native
  @JSImport("superstruct/lib/structs/types", "union")
  @js.native
  def union_ABCDEFGHIJ[A, B, C, D, E, F, G, H, I, J](
    Structs: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify TupleSchema<[A, B, C, D, E, F, G, H, I, J]> */ js.Any
  ): Struct[A | B | C | D | E | F | G | H | I | J, Null] = js.native
  @JSImport("superstruct/lib/structs/types", "union")
  @js.native
  def union_ABCDEFGHIJK[A, B, C, D, E, F, G, H, I, J, K](
    Structs: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify TupleSchema<[A, B, C, D, E, F, G, H, I, J, K]> */ js.Any
  ): Struct[A | B | C | D | E | F | G | H | I | J | K, Null] = js.native
  @JSImport("superstruct/lib/structs/types", "union")
  @js.native
  def union_ABCDEFGHIJKL[A, B, C, D, E, F, G, H, I, J, K, L](
    Structs: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify TupleSchema<[A, B, C, D, E, F, G, H, I, J, K, L]> */ js.Any
  ): Struct[A | B | C | D | E | F | G | H | I | J | K | L, Null] = js.native
  @JSImport("superstruct/lib/structs/types", "union")
  @js.native
  def union_ABCDEFGHIJKLM[A, B, C, D, E, F, G, H, I, J, K, L, M](
    Structs: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify TupleSchema<[A, B, C, D, E, F, G, H, I, J, K, L, M]> */ js.Any
  ): Struct[A | B | C | D | E | F | G | H | I | J | K | L | M, Null] = js.native
  @JSImport("superstruct/lib/structs/types", "union")
  @js.native
  def union_ABCDEFGHIJKLMN[A, B, C, D, E, F, G, H, I, J, K, L, M, N](
    Structs: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify TupleSchema<[A, B, C, D, E, F, G, H, I, J, K, L, M, N]> */ js.Any
  ): Struct[A | B | C | D | E | F | G | H | I | J | K | L | M | N, Null] = js.native
  @JSImport("superstruct/lib/structs/types", "union")
  @js.native
  def union_ABCDEFGHIJKLMNO[A, B, C, D, E, F, G, H, I, J, K, L, M, N, O](
    Structs: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify TupleSchema<[A, B, C, D, E, F, G, H, I, J, K, L, M, N, O]> */ js.Any
  ): Struct[A | B | C | D | E | F | G | H | I | J | K | L | M | N | O, Null] = js.native
  @JSImport("superstruct/lib/structs/types", "union")
  @js.native
  def union_ABCDEFGHIJKLMNOP[A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P](
    Structs: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify TupleSchema<[A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P]> */ js.Any
  ): Struct[A | B | C | D | E | F | G | H | I | J | K | L | M | N | O | P, Null] = js.native
  @JSImport("superstruct/lib/structs/types", "union")
  @js.native
  def union_ABCDEFGHIJKLMNOPQ[A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q](
    Structs: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify TupleSchema<[A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q]> */ js.Any
  ): Struct[A | B | C | D | E | F | G | H | I | J | K | L | M | N | O | P | Q, Null] = js.native
  
  @JSImport("superstruct/lib/structs/types", "unknown")
  @js.native
  def unknown(): Struct[_, Null] = js.native
  
  @JSImport("superstruct/lib/structs/types", "object")
  @js.native
  def `object`(): Struct[Record[String, _], Null] = js.native
  @JSImport("superstruct/lib/structs/types", "object")
  @js.native
  def `object`[S /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObjectSchema */ js.Any */](schema: S): Struct[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObjectType<S> */ _, 
    S
  ] = js.native
}
