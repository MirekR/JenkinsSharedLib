def call(body) {
	node('TestNode') {
		body()
	}
}

return this
