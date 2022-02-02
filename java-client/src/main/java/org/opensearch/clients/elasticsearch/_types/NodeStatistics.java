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

package org.opensearch.clients.elasticsearch._types;

import org.opensearch.clients.json.JsonpDeserializable;
import org.opensearch.clients.json.JsonpDeserializer;
import org.opensearch.clients.json.JsonpMapper;
import org.opensearch.clients.json.JsonpSerializable;
import org.opensearch.clients.json.ObjectBuilderDeserializer;
import org.opensearch.clients.json.ObjectDeserializer;
import org.opensearch.clients.util.ApiTypeHelper;
import org.opensearch.clients.util.ObjectBuilder;
import org.opensearch.clients.util.ObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.util.List;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: _types.NodeStatistics

/**
 *
 * @see <a href=
 *      "https://github.com/elastic/elasticsearch-specification/tree/98036c3/specification/_types/Node.ts#L28-L36">API
 *      specification</a>
 */
@JsonpDeserializable
public class NodeStatistics implements JsonpSerializable {
	private final List<ErrorCause> failures;

	private final int total;

	private final int successful;

	private final int failed;

	// ---------------------------------------------------------------------------------------------

	private NodeStatistics(Builder builder) {

		this.failures = ApiTypeHelper.unmodifiable(builder.failures);
		this.total = ApiTypeHelper.requireNonNull(builder.total, this, "total");
		this.successful = ApiTypeHelper.requireNonNull(builder.successful, this, "successful");
		this.failed = ApiTypeHelper.requireNonNull(builder.failed, this, "failed");

	}

	public static NodeStatistics of(Function<Builder, ObjectBuilder<NodeStatistics>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * API name: {@code failures}
	 */
	public final List<ErrorCause> failures() {
		return this.failures;
	}

	/**
	 * Required - Total number of nodes selected by the request.
	 * <p>
	 * API name: {@code total}
	 */
	public final int total() {
		return this.total;
	}

	/**
	 * Required - Number of nodes that responded successfully to the request.
	 * <p>
	 * API name: {@code successful}
	 */
	public final int successful() {
		return this.successful;
	}

	/**
	 * Required - Number of nodes that rejected the request or failed to respond. If
	 * this value is not 0, a reason for the rejection or failure is included in the
	 * response.
	 * <p>
	 * API name: {@code failed}
	 */
	public final int failed() {
		return this.failed;
	}

	/**
	 * Serialize this object to JSON.
	 */
	public void serialize(JsonGenerator generator, JsonpMapper mapper) {
		generator.writeStartObject();
		serializeInternal(generator, mapper);
		generator.writeEnd();
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		if (ApiTypeHelper.isDefined(this.failures)) {
			generator.writeKey("failures");
			generator.writeStartArray();
			for (ErrorCause item0 : this.failures) {
				item0.serialize(generator, mapper);

			}
			generator.writeEnd();

		}
		generator.writeKey("total");
		generator.write(this.total);

		generator.writeKey("successful");
		generator.write(this.successful);

		generator.writeKey("failed");
		generator.write(this.failed);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link NodeStatistics}.
	 */

	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<NodeStatistics> {
		@Nullable
		private List<ErrorCause> failures;

		private Integer total;

		private Integer successful;

		private Integer failed;

		/**
		 * API name: {@code failures}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>failures</code>.
		 */
		public final Builder failures(List<ErrorCause> list) {
			this.failures = _listAddAll(this.failures, list);
			return this;
		}

		/**
		 * API name: {@code failures}
		 * <p>
		 * Adds one or more values to <code>failures</code>.
		 */
		public final Builder failures(ErrorCause value, ErrorCause... values) {
			this.failures = _listAdd(this.failures, value, values);
			return this;
		}

		/**
		 * API name: {@code failures}
		 * <p>
		 * Adds a value to <code>failures</code> using a builder lambda.
		 */
		public final Builder failures(Function<ErrorCause.Builder, ObjectBuilder<ErrorCause>> fn) {
			return failures(fn.apply(new ErrorCause.Builder()).build());
		}

		/**
		 * Required - Total number of nodes selected by the request.
		 * <p>
		 * API name: {@code total}
		 */
		public final Builder total(int value) {
			this.total = value;
			return this;
		}

		/**
		 * Required - Number of nodes that responded successfully to the request.
		 * <p>
		 * API name: {@code successful}
		 */
		public final Builder successful(int value) {
			this.successful = value;
			return this;
		}

		/**
		 * Required - Number of nodes that rejected the request or failed to respond. If
		 * this value is not 0, a reason for the rejection or failure is included in the
		 * response.
		 * <p>
		 * API name: {@code failed}
		 */
		public final Builder failed(int value) {
			this.failed = value;
			return this;
		}

		/**
		 * Builds a {@link NodeStatistics}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public NodeStatistics build() {
			_checkSingleUse();

			return new NodeStatistics(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link NodeStatistics}
	 */
	public static final JsonpDeserializer<NodeStatistics> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			NodeStatistics::setupNodeStatisticsDeserializer);

	protected static void setupNodeStatisticsDeserializer(ObjectDeserializer<NodeStatistics.Builder> op) {

		op.add(Builder::failures, JsonpDeserializer.arrayDeserializer(ErrorCause._DESERIALIZER), "failures");
		op.add(Builder::total, JsonpDeserializer.integerDeserializer(), "total");
		op.add(Builder::successful, JsonpDeserializer.integerDeserializer(), "successful");
		op.add(Builder::failed, JsonpDeserializer.integerDeserializer(), "failed");

	}

}