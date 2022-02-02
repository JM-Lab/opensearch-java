/*
 * Licensed to Elasticsearch B.V. under one or more contributor
 * license agreements. See the NOTICE file distributed with
 * this work for additional information regarding copyright
 * ownership. Elasticsearch B.V. licenses this file to you under
 * the Apache License, Version 2.0 (the "License"); you may
 * not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

//----------------------------------------------------
// THIS CODE IS GENERATED. MANUAL EDITS WILL BE LOST.
//----------------------------------------------------

package org.opensearch.clients.elasticsearch._types.aggregations;

import org.opensearch.clients.elasticsearch._types.SortOptions;
import org.opensearch.clients.json.JsonpDeserializable;
import org.opensearch.clients.json.JsonpDeserializer;
import org.opensearch.clients.json.JsonpMapper;
import org.opensearch.clients.json.ObjectBuilderDeserializer;
import org.opensearch.clients.json.ObjectDeserializer;
import org.opensearch.clients.util.ApiTypeHelper;
import org.opensearch.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.util.List;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: _types.aggregations.BucketSortAggregation

/**
 *
 * @see <a href=
 *      "https://github.com/elastic/elasticsearch-specification/tree/98036c3/specification/_types/aggregations/pipeline.ts#L56-L61">API
 *      specification</a>
 */
@JsonpDeserializable
public class BucketSortAggregation extends AggregationBase implements AggregationVariant {
	@Nullable
	private final Integer from;

	@Nullable
	private final GapPolicy gapPolicy;

	@Nullable
	private final Integer size;

	private final List<SortOptions> sort;

	// ---------------------------------------------------------------------------------------------

	private BucketSortAggregation(Builder builder) {
		super(builder);

		this.from = builder.from;
		this.gapPolicy = builder.gapPolicy;
		this.size = builder.size;
		this.sort = ApiTypeHelper.unmodifiable(builder.sort);

	}

	public static BucketSortAggregation of(Function<Builder, ObjectBuilder<BucketSortAggregation>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Aggregation variant kind.
	 */
	@Override
	public Aggregation.Kind _aggregationKind() {
		return Aggregation.Kind.BucketSort;
	}

	/**
	 * API name: {@code from}
	 */
	@Nullable
	public final Integer from() {
		return this.from;
	}

	/**
	 * API name: {@code gap_policy}
	 */
	@Nullable
	public final GapPolicy gapPolicy() {
		return this.gapPolicy;
	}

	/**
	 * API name: {@code size}
	 */
	@Nullable
	public final Integer size() {
		return this.size;
	}

	/**
	 * API name: {@code sort}
	 */
	public final List<SortOptions> sort() {
		return this.sort;
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		super.serializeInternal(generator, mapper);
		if (this.from != null) {
			generator.writeKey("from");
			generator.write(this.from);

		}
		if (this.gapPolicy != null) {
			generator.writeKey("gap_policy");
			this.gapPolicy.serialize(generator, mapper);
		}
		if (this.size != null) {
			generator.writeKey("size");
			generator.write(this.size);

		}
		if (ApiTypeHelper.isDefined(this.sort)) {
			generator.writeKey("sort");
			generator.writeStartArray();
			for (SortOptions item0 : this.sort) {
				item0.serialize(generator, mapper);

			}
			generator.writeEnd();

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link BucketSortAggregation}.
	 */

	public static class Builder extends AggregationBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<BucketSortAggregation> {
		@Nullable
		private Integer from;

		@Nullable
		private GapPolicy gapPolicy;

		@Nullable
		private Integer size;

		@Nullable
		private List<SortOptions> sort;

		/**
		 * API name: {@code from}
		 */
		public final Builder from(@Nullable Integer value) {
			this.from = value;
			return this;
		}

		/**
		 * API name: {@code gap_policy}
		 */
		public final Builder gapPolicy(@Nullable GapPolicy value) {
			this.gapPolicy = value;
			return this;
		}

		/**
		 * API name: {@code size}
		 */
		public final Builder size(@Nullable Integer value) {
			this.size = value;
			return this;
		}

		/**
		 * API name: {@code sort}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>sort</code>.
		 */
		public final Builder sort(List<SortOptions> list) {
			this.sort = _listAddAll(this.sort, list);
			return this;
		}

		/**
		 * API name: {@code sort}
		 * <p>
		 * Adds one or more values to <code>sort</code>.
		 */
		public final Builder sort(SortOptions value, SortOptions... values) {
			this.sort = _listAdd(this.sort, value, values);
			return this;
		}

		/**
		 * API name: {@code sort}
		 * <p>
		 * Adds a value to <code>sort</code> using a builder lambda.
		 */
		public final Builder sort(Function<SortOptions.Builder, ObjectBuilder<SortOptions>> fn) {
			return sort(fn.apply(new SortOptions.Builder()).build());
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link BucketSortAggregation}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public BucketSortAggregation build() {
			_checkSingleUse();

			return new BucketSortAggregation(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link BucketSortAggregation}
	 */
	public static final JsonpDeserializer<BucketSortAggregation> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, BucketSortAggregation::setupBucketSortAggregationDeserializer);

	protected static void setupBucketSortAggregationDeserializer(ObjectDeserializer<BucketSortAggregation.Builder> op) {
		setupAggregationBaseDeserializer(op);
		op.add(Builder::from, JsonpDeserializer.integerDeserializer(), "from");
		op.add(Builder::gapPolicy, GapPolicy._DESERIALIZER, "gap_policy");
		op.add(Builder::size, JsonpDeserializer.integerDeserializer(), "size");
		op.add(Builder::sort, JsonpDeserializer.arrayDeserializer(SortOptions._DESERIALIZER), "sort");

	}

}