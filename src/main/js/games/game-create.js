'use strict';

import React from 'react';

class CreateDialog extends React.Component {

    constructor(props) {
        super(props);

        this.state = { value: ''};

        this.handleSubmit = this.handleSubmit.bind(this);
        this.handleChange = this.handleChange.bind(this);
    }

    handleChange(event) {
        this.setState({value: event.target.value});
    }

    handleSubmit(e) {
        console.log('A name was changed: ' + this.state.value);
        e.preventDefault();

    }

    render() {
        return (
            <div>
                <div id="createEmployee">
                    <div>
                        <h2>Create new Game</h2>
                        <form>
                            <input type="text" value={this.state.value} onChange={this.handleChange}/>
                            <button onClick={this.handleSubmit}>Create</button>
                        </form>
                    </div>
                </div>
            </div>
        )
    }

}

export default CreateDialog;